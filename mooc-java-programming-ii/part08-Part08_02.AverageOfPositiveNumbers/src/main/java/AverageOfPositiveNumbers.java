
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (userInput > 0) {
                sum += userInput;
                count++;
            }
        }
        System.out.println((double) sum / count);
    }
}
