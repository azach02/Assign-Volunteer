import java.util.Scanner;

public class AssignVolunteer {
    public static void main(String[] args) {
        // Variables and Constants
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Jeremy";
        final String ELECTRONICS_PRICER = "Rose";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("What type of donation is this? ");
        System.out.println("Enter " + CLOTHING_CODE + " for CLOTHING, " + FURNITURE_CODE +
                " for FURNITURE, " + ELECTRONICS_CODE + " for ELECTRONICS, " + OTHER_CODE +
                " for OTHER INQUIRIES: ");
        donationType = input.nextInt();

        // While
        while (donationType < CLOTHING_CODE) {
                
        }

        // Processing with switch statement
        switch (donationType) {
            case CLOTHING_CODE:
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation.";
                break;
            case FURNITURE_CODE:
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation.";
                break;
            case ELECTRONICS_CODE:
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation.";
                break;
            case OTHER_CODE:
                volunteer = OTHER_PRICER;
                message = "another kind of donation.";
                break;
            default:
                volunteer = "Unknown";
                message = "an invalid donation type.";
        }
        // Output
        System.out.println("You entered: " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is: " + volunteer);
        input.close();
    }
}
