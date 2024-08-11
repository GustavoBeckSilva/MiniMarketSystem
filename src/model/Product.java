package model;

import javax.swing.*;

public class Product {

    // Attributes
    private String productName;
    private double productPrice;

    // Constructor
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Getters and setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return productPrice;
    }

    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    // Public methods
    public void showProductInfo() {
        JOptionPane.showMessageDialog(null, "Nome do produto: " + this.getProductName()
                + "\nPreço: R$ " + this.getPrice(),
                "Informações do produto", JOptionPane.INFORMATION_MESSAGE);
    }
}
