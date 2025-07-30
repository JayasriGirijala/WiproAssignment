package project;

class Vehicle {
    String color;
    int wheels;
    String model;

    Vehicle(String color, int wheels, String model) {
        this.color = color;
        this.wheels = wheels;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Number of wheels: " + wheels);
    }
}

class Car extends Vehicle {
    Car(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void drive() {
        System.out.println("The car is driving smoothly.");
    }
}

class Bus extends Vehicle {
    Bus(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void transportPassengers() {
        System.out.println("The bus is transporting passengers.");
    }
}

class Truck extends Vehicle {
    Truck(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void carryLoad() {
        System.out.println("The truck is carrying heavy load.");
    }
}

public class Road {
    public static void main(String[] args) {
        Car car = new Car("Red", 4, "Sedan");
        System.out.println("Car Details:");
        car.displayInfo();
        car.drive();
        System.out.println();

        Bus bus = new Bus("Blue", 6, "Volvo");
        System.out.println("Bus Details:");
        bus.displayInfo();
        bus.transportPassengers();
        System.out.println();

        Truck truck = new Truck("Black", 8, "Tata Heavy Duty");
        System.out.println("Truck Details:");
        truck.displayInfo();
        truck.carryLoad();
    }
}

/*Number of wheels: 6
The bus is transporting passengers.

Truck Details:
Model: Tata Heavy Duty
Color: Black
Number of wheels: 8
The truck is carrying heavy load.
*/