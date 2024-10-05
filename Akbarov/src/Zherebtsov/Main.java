package Zherebtsov;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Dylan", 18, 120000);
        Manager manager = new Manager("John", 18, 0);
        Worker worker = new Worker("Bob", 18, 0);
        System.out.println(manager.greeting());
        System.out.println(programmer.greeting());
        System.out.println(worker.greeting());
    }
}
