import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList toDoList;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userInput = this.scanner.nextLine();
            if (userInput.equals("stop")) {
                break;
            }
            if (userInput.equals("add")) {
                System.out.print("To add: ");
                this.toDoList.add(this.scanner.nextLine());
            }
            if (userInput.equals("remove")) {
                System.out.print("Which one is removed: ");
                this.toDoList.remove(Integer.valueOf(scanner.nextLine()));
            }
            if (userInput.equals("list")) {
                this.toDoList.print();
            }
        }
    }
}
