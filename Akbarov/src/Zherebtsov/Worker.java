package Zherebtsov;

public class Worker implements Nameble {
    private int age;
    private String name;
    public float salary;

    Worker( String name, int age, float salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String greeting() {
        return "My name is " + this.name;
    }
}
