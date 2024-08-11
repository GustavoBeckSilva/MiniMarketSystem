package model;

public abstract class Person {

    // Attributes
    private String personName; 
    private String personCpf;
    
    // Constructor
    public Person(String personName, String personCpf) {
        this.personName = personName; 
        this.personCpf = personCpf;
    }

    // Getters and setters
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCpf() {
        return personCpf;
    }

    public void setPersonCpf(String personCpf) {
        this.personCpf = personCpf;
    }
    
   
    // Abstract methods
    public abstract void showInformation();
}
