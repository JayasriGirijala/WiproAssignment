package project;

import java.util.*;

public class StudentValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
           
            System.out.print("Enter Register Number: ");
            String regNo = sc.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobileNo = sc.nextLine();
            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register Number must be exactly 9 characters.");
            }
            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register Number must contain only letters and digits.");
            }

            if (mobileNo.length() != 10) {
                throw new IllegalArgumentException("Mobile Number must be exactly 10 digits.");
            }
            if (!mobileNo.matches("[0-9]+")) {
                throw new NumberFormatException("Mobile Number must contain only digits.");
            }

            // If everything is valid
            System.out.println("Valid");

        } catch (NumberFormatException e) {
            System.out.println("Invalid - " + e.getMessage());

        } catch (IllegalArgumentException e) {
        
            System.out.println("Invalid - " + e.getMessage());

        } catch (NoSuchElementException e) {
            System.out.println("Invalid - " + e.getMessage());
        }
    }
}
//output
/*Enter Register Number: jayasri04
Enter Mobile Number: 76543890
Invalid - Mobile Number must be exactly 10 digits.


Enter Register Number: jaith2000
Enter Mobile Number: 7207004392
Valid
*/