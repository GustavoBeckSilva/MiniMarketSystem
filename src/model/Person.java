package model;

public abstract class Person {

    // Attributes
    private String personName; // Nome da pessoa

    // Constructor
    public Person(String personName) {
        this.personName = personName; // Seta o nome da pessoa
    }

    // Getters and setters
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    // Abstract methods
    public abstract void showInformation();
}
