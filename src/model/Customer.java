package model;

import javax.swing.*;

public class Customer extends Person {

    // Attributes
    private int customerPurchases;

    // Constructor
    public Customer(String personName, String personCpf) {
        super(personName, personCpf);
        this.customerPurchases = 0;
    }

    // Getters and setters
    public int getNumberOfPurchases() {
        return customerPurchases;
    }


    // Public methods
    @Override
    public void showInformation() {
        JOptionPane.showMessageDialog(null, "Nome do cliente: " + this.getPersonName()
                + "\nCPF: " + this.getPersonCpf() + "\nNúmero de compras: " + this.getNumberOfPurchases(),
                "Informações do cliente", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void incrementNumberOfPurchases() {
        this.customerPurchases++;
    }
}
