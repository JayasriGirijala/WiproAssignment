package project;

import java.util.Scanner;

//Custom exception for low salary
class LowSalException extends Exception {
 public LowSalException(String msg) {
     super(msg);
 }
}

//Emp class
class Emp {
 int empId;
 String empName;
 String designation;
 double basic;
 double hra;

 Emp(int empId, String empName, String designation, double basic) throws LowSalException {
     if (basic < 50000) {
         throw new LowSalException("Basic salary should be at least 50000");
     }

     this.empId = empId;
     this.empName = empName;
     this.designation = designation;
     this.basic = basic;
     this.hra = calculateHRA();
 }

 double calculateHRA() {
     if (designation.equalsIgnoreCase("Manager")) {
         return basic * 0.10;
     } else if (designation.equalsIgnoreCase("TeamLeader")) {
         return basic * 0.12;
     } else if (designation.equalsIgnoreCase("HR")) {
         return basic * 0.05;
     } else {
         return 0;
     }
 }

 void printDET() {
     System.out.println("ID: " + empId);
     System.out.println("Name: " + empName);
     System.out.println("Designation: " + designation);
     System.out.println("Basic: " + basic);
     System.out.println("HRA: " + hra);
 }
}

public class Employee{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Emp ID: ");
     int id = sc.nextInt();
     sc.nextLine(); //newline

     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Designation (Manager/TeamLeader/HR): ");
     String desig = sc.nextLine();

     System.out.print("Enter Basic Salary: ");
     double salary = sc.nextDouble();

     try {
         Emp emp = new Emp(id, name, desig, salary);
         emp.printDET();
     } catch (LowSalException e) {
         System.out.println("Invalid: " + e.getMessage());
     }
     sc.close();
 }
}
/*Enter Emp ID: 1
Enter Name: Jaya
Enter Designation (Manager/TeamLeader/HR): Manager
Enter Basic Salary: 70000
ID: 1
Name: Jaya
Designation: Manager
Basic: 70000.0
HRA: 7000.0
*/
