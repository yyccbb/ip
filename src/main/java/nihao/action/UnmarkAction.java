package nihao.action;
import nihao.action.task.Task;
import nihao.exception.IndexOutOfBoundsException;
import nihao.handler.DataHandler;
import nihao.handler.PrintHandler;

public class UnmarkAction implements Action{
    private int index;
    public UnmarkAction(String index) {
        this.index = Integer.parseInt(index);
    }
    @Override
    public void execute() throws IndexOutOfBoundsException {
        DataHandler.unmarkTask(index);
        Task task = DataHandler.getTask(index);
        PrintHandler.printWithDivider("Fine. I've marked this as uncompleted:\n" +
                "   " + task);
    }
}