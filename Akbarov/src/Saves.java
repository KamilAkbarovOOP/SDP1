import java.util.List;

interface Saves{
    void saveTask(Task task);
    void removeTask(Task task);
    List<Task> getAllTasks();
}