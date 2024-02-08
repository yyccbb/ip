package nihao.action.task;

import nihao.handler.DateTimeHandler;

import java.time.LocalDateTime;

public class DeadlineTask extends Task{
    private LocalDateTime by;
    public String getByString() {
        return DateTimeHandler.formatOutput(by);
    }
    public DeadlineTask(String taskName, LocalDateTime by) {
        super(taskName);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + getByString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof DeadlineTask && ((DeadlineTask) obj).taskName.equals(taskName)
                && ((DeadlineTask) obj).by.equals(by);
    }
}
