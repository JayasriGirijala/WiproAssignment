package project;
/*import java.util.Scanner;
class Worker{
	String name;
	double Salaryrate;
	Worker(String name,double Salaryrate){
		this.name=name;
		this.Salaryrate=Salaryrate;
	}
	double pay(int hours) {
		return 0.0;
	}
	void displayPay(int hours) {
        System.out.println("Worker Name: " + name);
        System.out.println("Weekly Pay: ₹" + pay(hours));
    }

	
}
class DailyWorker extends Worker{
	DailyWorker(String name, double salaryRate) {
        super(name, salaryRate); // Call Worker constructor
    }

    @Override
    double pay(int hours) {
        int daysWorked = hours / 8; // Convert hours to full days
        return daysWorked * Salaryrate; // salary = days * salaryRate
    }
	
	
}
class SalariedWorker extends Worker{
	SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate); // Call Worker constructor
    }

    @Override
    double pay(int hours) {
        return 40 * Salaryrate; // Always paid for 40 hours, fixed
    }
	
}


public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Daily Worker's name:");
        String dailyName = sc.nextLine();
        System.out.println("Enter Daily Worker's salary rate per day:");
        double dailyRate = sc.nextDouble();
        System.out.println("Enter hours worked by Daily Worker in a week:");
        int dailyHours = sc.nextInt();
        sc.nextLine(); // consume newline

        DailyWorker dailyWorker = new DailyWorker(dailyName, dailyRate);
        System.out.println("\nDaily Worker Payment:");
        dailyWorker.displayPay(dailyHours);

        // Input for Salaried Worker
        System.out.println("\nEnter Salaried Worker's name:");
        String salariedName = sc.nextLine();
        System.out.println("Enter Salaried Worker's salary rate per hour:");
        double salariedRate = sc.nextDouble();
        System.out.println("Enter hours worked by Salaried Worker in a week:");
        int salariedHours = sc.nextInt();

        SalariedWorker salariedWorker = new SalariedWorker(salariedName, salariedRate);
        System.out.println("\nSalaried Worker Payment:");
        salariedWorker.displayPay(salariedHours);

        sc.close();

	}

}
*/
import java.util.Scanner;

//Base class
class Worker {
 String name;
 double salaryRate;

 Worker(String name, double salaryRate) {
     this.name = name;
     this.salaryRate = salaryRate;
 }

 double pay(int hours) {
     return 0.0; // Overridden in subclasses
 }

 void displayPay(int hours) {
     System.out.println("Worker Name: " + name);
     System.out.println("Weekly Pay: ₹" + pay(hours));
 }
}

//DailyWorker class
class DailyWorker extends Worker {

 DailyWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }

 @Override
 double pay(int hours) {
     int daysWorked = hours / 8;
     return daysWorked * salaryRate;
 }
}

//SalariedWorker class
class SalariedWorker extends Worker {

 SalariedWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }

 @Override
 double pay(int hours) {
     return 40 * salaryRate; // Always for 40 hours
 }
}

//Main class
public class WorkerTest {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input for Daily Worker
     System.out.println("Enter Daily Worker's name:");
     String dailyName = sc.nextLine();
     System.out.println("Enter Daily Worker's salary rate per day:");
     double dailyRate = sc.nextDouble();
     System.out.println("Enter hours worked by Daily Worker in a week:");
     int dailyHours = sc.nextInt();
     sc.nextLine(); // consume newline

     DailyWorker dailyWorker = new DailyWorker(dailyName, dailyRate);
     System.out.println("\nDaily Worker Payment:");
     dailyWorker.displayPay(dailyHours);

     // Input for Salaried Worker
     System.out.println("\nEnter Salaried Worker's name:");
     String salariedName = sc.nextLine();
     System.out.println("Enter Salaried Worker's salary rate per hour:");
     double salariedRate = sc.nextDouble();
     System.out.println("Enter hours worked by Salaried Worker in a week:");
     int salariedHours = sc.nextInt();

     SalariedWorker salariedWorker = new SalariedWorker(salariedName, salariedRate);
     System.out.println("\nSalaried Worker Payment:");
     salariedWorker.displayPay(salariedHours);

     sc.close();
 }
}
/*Enter Daily Worker's name:
Aruna
Enter Daily Worker's salary rate per day:
23
Enter hours worked by Daily Worker in a week:
12

Daily Worker Payment:
Worker Name: Aruna
Weekly Pay: ₹23.0*/