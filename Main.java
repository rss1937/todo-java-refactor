import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Task\n2. Show Tasks\n3. Mark Task as Done\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;
                case 2:
                    manager.showTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to mark as done: ");
                    int index = scanner.nextInt() - 1;
                    manager.markTaskAsDone(index);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}