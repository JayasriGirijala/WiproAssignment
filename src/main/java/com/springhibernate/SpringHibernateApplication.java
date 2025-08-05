package com.springhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springhibernate.repository")
@EntityScan(basePackages = "com.springhibernate.entity")
public class SpringHibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateApplication.class, args);
    }
}
//http://localhost:8080/api/user/        ---post
/*{
"name": "jaya",
"age": 21,
"salary": 45000
}
0/p
{
"id": 1,
"name": "jaya",
"age": 21,
"salary": 45000.0
}
 update existing user --http://localhost:8080/api/user/1   --put
 DELETE  ------       http://localhost:8080/api/user/1
  retrive all users 
http://localhost:8080/api/user/     -----get
[
    {
        "id": 1,
        "name": "jaya",
        "age": 21,
        "salary": 55000.0
    },
    {
        "id": 2,
        "name": "vyshu",
        "age": 21,
        "salary": 45000.0
    },
    {
        "id": 4,
        "name": "lucky",
        "age": 21,
        "salary": 45000.0
    },
    {
        "id": 5,
        "name": "sharon",
        "age": 21,
        "salary": 45000.0
    }
]*/
