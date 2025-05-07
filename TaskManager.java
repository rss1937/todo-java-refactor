import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static TaskManager instance;
    private List<Task> tasks;
    private List<Observer> observers;

    private TaskManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers("Task added: " + task.getDescription());
    }

    public void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markAsDone();
            notifyObservers("Task completed: " + task.getDescription());
        }
    }

    public void showTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}