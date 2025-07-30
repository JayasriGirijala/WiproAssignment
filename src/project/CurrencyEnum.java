package project;

public class CurrencyEnum{
    enum Currency {					// Enum for different paper currency types
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        for (Currency c : Currency.values()) { // // Loop through enum values and print each
            System.out.println("Currency: " + c);
            switch (c) {
                case ONE:
                    System.out.println("Description: ₹1 note - Rare in circulation now.");
                    break;
                case FIVE:
                    System.out.println("Description: ₹5 note - Mostly replaced by coins.");
                    break;
                case TEN:
                    System.out.println("Description: ₹10 note - Common for small transactions.");
                    break;
                case TWENTY:
                    System.out.println("Description: ₹20 note - Newer yellow note in circulation.");
                    break;
                case FIFTY:
                    System.out.println("Description: ₹50 note - Light blue note, used frequently.");
                    break;
                case HUNDRED:
                    System.out.println("Description: ₹100 note - Purple colored and widely used.");
                    break;
            }

            System.out.println(); // For better readability
        }
    }
}

/*Currency: ONE
Description: ₹1 note - Rare in circulation now.

Currency: FIVE
Description: ₹5 note - Mostly replaced by coins.

Currency: TEN
Description: ₹10 note - Common for small transactions.

Currency: TWENTY
Description: ₹20 note - Newer yellow note in circulation.

Currency: FIFTY
Description: ₹50 note - Light blue note, used frequently.

Currency: HUNDRED
Description: ₹100 note - Purple colored and widely used.
*/
