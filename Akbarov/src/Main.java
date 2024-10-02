public class Main {
    public static void main(String[] args) {
        Saves saves = new TaskSaves();
        TaskManaging manager = new TaskManaging(saves);

        Task task1 = new Task("Go to uni");
        Task task2 = new Task("Shop");

        manager.addTask(task1);
        manager.addTask(task2);

        manager.showTasks();

        manager.completeTask(task1);
        manager.showTasks();

        manager.removeTask(task2);
        manager.showTasks();
    }
}
