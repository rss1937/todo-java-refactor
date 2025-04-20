import java.time.LocalDate;

public class DeadlineTask extends TaskDecorator {
    private LocalDate deadline;

    public DeadlineTask(Task task, LocalDate deadline) {
        super(task);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return super.toString() + " (Due: " + deadline.toString() + ")";
    }
}