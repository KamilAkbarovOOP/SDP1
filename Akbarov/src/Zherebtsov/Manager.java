package Zherebtsov;

public class Manager extends Worker implements ManagerInterface, Nameble{
    private boolean workAvailability = true;

    public Manager(String name, int age, float salary){
        super(name, age, salary);
    }


    public boolean Availability() {
        return workAvailability;
    }

    public void setWorkAvailability(boolean legionAvailability){
        this.workAvailability = legionAvailability;
    }

    @Override
    public String greeting(){
        return "My name is " + super.getName() + " and I'm manager.";
    }
}