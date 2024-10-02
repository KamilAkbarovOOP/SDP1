import java.util.ArrayList;
import java.util.List;

public class TaskSaves implements Saves{
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void saveTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }
}
