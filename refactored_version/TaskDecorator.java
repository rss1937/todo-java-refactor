public abstract class TaskDecorator extends Task {
    protected Task decoratedTask;

    public TaskDecorator(Task decoratedTask) {
        super(decoratedTask.getDescription());
        this.decoratedTask = decoratedTask;
    }

    @Override
    public String toString() {
        return decoratedTask.toString();
    }
}