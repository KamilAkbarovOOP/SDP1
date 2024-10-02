public class TaskManaging {
    private Saves saves;

    public TaskManaging(Saves saves) {
        this.saves = saves;
    }

    public void addTask(Task task) {
        saves.saveTask(task);
        System.out.println("Task added: " + task.getName());
    }

    public void removeTask(Task task) {
        saves.removeTask(task);
        System.out.println("Task removed: " + task.getName());
        System.out.println("------------------------------------------");
    }

    public void completeTask(Task task) {
        task.makeCompleted();
        System.out.println("Task completed: " + task.getName());
        System.out.println("------------------------------------------");
    }

    public void showTasks() {
        for (Task task : saves.getAllTasks()) {
            System.out.println(task);
        }
        System.out.println("------------------------------------------");
    }
}
