package com.myapp.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}

//Ride sent to Kafka
/*http://localhost:8082/rides

[
{
    "id": 1,
    "driverName": "John Doe",
    "passengerName": "Alice",
    "pickupLocation": "Airport",
    "dropLocation": "Downtown",
    "fare": 250.0
},
{
    "id": 2,
    "driverName": "Jane Smith",
    "passengerName": "Bob",
    "pickupLocation": "City Center",
    "dropLocation": "University",
    "fare": 300.0
},
{
    "id": 3,
    "driverName": "Mike Johnson",
    "passengerName": "Charlie",
    "pickupLocation": "Mall",
    "dropLocation": "Train Station",
    "fare": 180.0
},
{
    "id": 4,
    "driverName": "Emily Davis",
    "passengerName": "David",
    "pickupLocation": "Office Park",
    "dropLocation": "Suburbs",
    "fare": 220.0
},
{
    "id": 5,
    "driverName": "Chris Lee",
    "passengerName": "Eva",
    "pickupLocation": "Stadium",
    "dropLocation": "Hotel",
    "fare": 270.0
}
]*/