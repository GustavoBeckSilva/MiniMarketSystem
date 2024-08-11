package model;

import javax.swing.*;

public class Customer extends Person {

    // Attributes
    private int customerPurchases;
    private String customerCpf;

    // Constructor
    public Customer(String personName, String customerCpf) {
        super(personName);
        this.customerCpf = customerCpf;
        this.customerPurchases = 0;
    }

    // Getters and setters
    public int getNumberOfPurchases() {
        return customerPurchases;
    }

    public String getCpf() {
        return customerCpf;
    }

    public void setCpf(String customerCpf) {
        this.customerCpf = customerCpf;
    }

    // Public methods
    @Override
    public void showInformation() {
        JOptionPane.showMessageDialog(null, "Nome do cliente: " + this.getPersonName()
                + "\nCPF: " + this.getCpf() + "\nNúmero de compras: " + this.getNumberOfPurchases(),
                "Informações do cliente", JOptionPane.INFORMATION_MESSAGE);
    }

    public void incrementNumberOfPurchases() {
        this.customerPurchases++;
    }
}
