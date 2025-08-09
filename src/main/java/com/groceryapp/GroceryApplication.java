package com.groceryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroceryApplication.class, args);
    }
}

//http://localhost:8080/api/groceries
/*[
{
"id": 1,
"name": "Apples",
"quantity": 10,
"price": 2.5
},
{
"id": 2,
"name": "Bananas",
"quantity": 12,
"price": 1.5
},
{
"id": 3,
"name": "Carrots",
"quantity": 8,
"price": 1.2
},
{
"id": 4,
"name": "Tomatoes",
"quantity": 15,
"price": 2.0
}
]*/
