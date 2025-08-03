package springdemo;

public class User {
    private int id;
    private String name;
    private Company company;

    public User(int id, String name, Company company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public void showDetails() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
        System.out.println("Company: " + company.getCompanyName());
    }
}
