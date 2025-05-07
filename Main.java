public class Main {
    public static void main(String[] args) {
        TaskManager manager = TaskManager.getInstance();

        // Create observers
        TaskObserver observer1 = new TaskObserver("User1");
        TaskObserver observer2 = new TaskObserver("Logger");

        // Register observers
        manager.addObserver(observer1);
        manager.addObserver(observer2);

        // Create and manage tasks
        Task task1 = new Task("Study for exam");
        Task task2 = new Task("Complete report");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.markTaskAsDone(0);

        manager.showTasks();
    }
}