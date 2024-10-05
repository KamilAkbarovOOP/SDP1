package Zherebtsov;

public class Programmer extends Worker implements ProgrammerInterface, Nameble{

    private int experienceLevel = 2;

    public Programmer(String name, int age, float salary){
        super(name, age, salary);
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }
    @Override
    public String greeting(){
        return "My name is " + super.getName() + " and I'm programmer.";
    }
}
