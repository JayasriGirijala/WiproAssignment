package project;

import static java.lang.System.out; // Used to avoid writing System.out explicitly

class Hall {
    public void show() {
        out.println("This is the first room while entering the house");
    }
}

class Kitchen {
    public void showAppliances() {
        String[] appliances = {"Fridge", "Microwave", "Oven", "Toaster"};

        out.println("Kitchen appliances:");
        for (String appliance : appliances) {
            out.println(appliance);
        }

        // Copying array to a new array
        String[] copied = new String[appliances.length];
        System.arraycopy(appliances, 0, copied, 0, appliances.length);

        out.println("\nCopied appliance list:");
        for (String item : copied) {
            out.println(item);
        }
    }
}

// Public class must match the file name
public class HouseDemo {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.show();

        out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}

/*Oven
Toaster

Copied appliance list:
Fridge
Microwave
Oven
Toaster
*/
