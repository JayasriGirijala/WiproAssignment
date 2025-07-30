package project;

import java.util.Scanner;

class EmployeeClass {
    String empId;
    String name;
    int yearOfBirth;

    EmployeeClass(String empId, String name, int yearOfBirth) {
        this.empId = empId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);

        String[] parts = empId.split("-");

        if (parts.length == 3) {
            String year = parts[0];
            char designation = parts[1].charAt(0);
            String number = parts[2];

            String desigFull = "";
            if (designation == 'F') {
                desigFull = "Faculty";
            } else if (designation == 'S') {
                desigFull = "Staff";
            } else {
                desigFull = "Unknown";
            }

            System.out.println("Parsed Details from Employee ID:");
            System.out.println("Year Joined: 20" + year);
            System.out.println("Designation: " + desigFull);
            System.out.println("Number: " + number);
        } else {
            System.out.println("Invalid Employee ID format.");
        }
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID (format: yy-D-X): ");
        String empId = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Year of Birth: ");
        int yob = sc.nextInt();

        EmployeeClass emp = new EmployeeClass(empId, name, yob);
        emp.displayDetails();
        sc.close();
    }
}


/*Enter Year of Birth: 2003
Employee ID: 19-F-65
Name: jaya
Year of Birth: 2003
Parsed Details from Employee ID:
Year Joined: 2019
Designation: Faculty
Number: 65*/