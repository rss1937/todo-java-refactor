import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = TaskManager.getInstance();

        Task basicTask = new Task("Submit project report");
        Task decoratedTask = new HighPriorityTask(new DeadlineTask(basicTask, LocalDate.of(2025, 4, 30)));

        manager.addTask(decoratedTask);
        manager.showTasks();
    }
}