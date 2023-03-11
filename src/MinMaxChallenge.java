import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0, max = 0;
        int counter = 0;
        boolean exit = false;


        do {
            System.out.println("Enter any number (or a character to quit): ");
            String stringNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(stringNumber);
                // if this is the first loop, set min and max equal to the number
                if (counter == 0) {
                    min = number;
                    max = number;
                }
                // if number is less than or equal to min, change min
                if (number <= min) {
                    min = number;
                }
                // if number is greater than or equal to max, change max
                if (number >= max){
                    max = number;
                }
                // increment counter so we don't automatically set mina and max to number
                counter++;
            } catch (NumberFormatException nfe) {
                exit = true;
            }
        } while (!exit);
        // if counter is 0 it means user has not yet submitted a valid character and there is no min
        // or max to be shown
        if (counter > 0) {
            System.out.println("The min number entered was: " + min + " and the max was: " + max);
        } else {
            System.out.println("You did not enter a valid number");
        }
    }
}
