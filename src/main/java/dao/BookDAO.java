package dao;

import java.sql.*;
import java.util.*;
import model.Book;

public class BookDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/bookdb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Jayasri11@";

    private static final String INSERT_BOOK_SQL = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
    private static final String SELECT_ALL_BOOKS = "SELECT * FROM books";

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public void insertBook(Book book) throws SQLException {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_BOOK_SQL)) {
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setFloat(3, book.getPrice());
            ps.executeUpdate();
        }
    }

    public List<Book> listAllBooks() throws SQLException {
        List<Book> books = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_ALL_BOOKS);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getFloat("price"));
                books.add(book);
            }
        }
        return books;
    }
}
