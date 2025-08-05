package com.restconjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApp.class, args);
    }
}
//http://localhost:8080/springbootjdbc/books   --get
/*[
{
"bookid": 982,
"bookname": "Programming with Java",
"author": "E. Balaguruswamy",
"price": 350
},
{
"bookid": 5433,
"bookname": "Core and Advance Java",
"author": "R. Nageswara Rao",
"price": 800
},
{
"bookid": 6321,
"bookname": "Data Structures and Algorithms in Java",
"author": "Robert Lafore",
"price": 590
},
{
"bookid": 6830,
"bookname": "Exploring C",
"author": "Yashavant Kanetkar",
"price": 670
}
]*/