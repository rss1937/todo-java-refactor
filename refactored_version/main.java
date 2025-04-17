public class Main {
    public static void main(String[] args) {
        TaskManager manager = TaskManager.getInstance();

        Task task1 = TaskFactory.createTask("Study for exam");
        Task task2 = TaskFactory.createTask("Do the laundry");

        manager.addTask(task1.getDescription());
        manager.addTask(task2.getDescription());

        manager.showTasks();
    }
}
