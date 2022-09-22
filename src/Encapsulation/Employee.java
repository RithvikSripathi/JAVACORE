package Encapsulation;

public class Employee {

    private int id;
    private String name;
    private int retirementAge;

    //Default Constructor
    /*public Employee() {
    }*/

    //Parametrized constructor
    public Employee(int id, String name, int retirementAge) {
        this.id = id;
        this.name = name;
        this.retirementAge = retirementAge;
    }

    //Getter and setter to access private variables
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRetirementAge() {
        return this.retirementAge;
    }

    public void setRetirementAge(int retirementAge) {
        this.id = id;
    }

}