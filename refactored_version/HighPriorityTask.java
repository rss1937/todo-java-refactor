public class HighPriorityTask extends TaskDecorator {

    public HighPriorityTask(Task task) {
        super(task);
    }

    @Override
    public String toString() {
        return "[HIGH PRIORITY] " + super.toString();
    }
}