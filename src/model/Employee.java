package model;

import java.text.*;
import java.util.*;
import javax.swing.*;

public class Employee extends Person {

    // Attributes
    private String employeeTurn;
    private Date employeeAdmition;

    // Constructor
    public Employee(String personName, String personCpf, String employeeTurn, Date employeeAdmition) {
        super(personName, personCpf);
        this.employeeTurn = employeeTurn;
        this.employeeAdmition = employeeAdmition;
    }

    // Getters and setters
    public String getTurn() {
        return employeeTurn;
    }

    public void setTurn(String turn) {
        this.employeeTurn = turn;
    }

    public Date getAdmition() {
        return employeeAdmition;
    }

    public void setAdmition(Date employeeAdmition) {
        this.employeeAdmition = employeeAdmition;
    }

    // Public methods
    @Override
    public void showInformation() {

        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormater.format(this.getAdmition());

        JOptionPane.showMessageDialog(null, "Nome do caixa: " + this.getPersonName()
                + "\nTurno: " + this.getTurn() + "\nData de admissão: " + formattedDate + "\nCPF: " + this.getPersonCpf(),
                "Informações do caixa", JOptionPane.INFORMATION_MESSAGE);
    }
}
