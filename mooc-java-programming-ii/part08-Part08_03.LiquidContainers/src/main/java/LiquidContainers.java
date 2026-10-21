
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    System.out.println("");
                    continue;
                }
                containerOne += amount;
                if (containerOne > 100) {
                    containerOne = 100;
                }
            }

            if (command.equals("move")) {
                if (amount > containerOne) {
                    amount = containerOne;
                }
                containerOne -= amount;
                containerTwo += amount;
                if (containerTwo > 100) {
                    containerTwo = 100;
                }
            }

            if (command.equals("remove")) {
                containerTwo -= amount;
                if (containerTwo < 0) {
                    containerTwo = 0;
                }
            }

            System.out.println("");
        }
        scan.close();
    }

}
