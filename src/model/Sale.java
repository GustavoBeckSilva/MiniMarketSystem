package model;

import java.util.*;
import javax.swing.*;

public class Sale {

    // Atributes
    private Customer customer;
    private Employee employee;
    private Map<Product, Integer> productQuantities;
    private double totalAmount;
    private double givedValue;

    // Constructor
    public Sale(Customer customer, Employee employee) {
        this.customer = customer;
        this.employee = employee;
        this.productQuantities = new HashMap<>();
        this.totalAmount = 0.0;
    }

    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public Employee getSeller() {
        return employee;
    }

    public double getGivedValue() {
        return givedValue;
    }

    public void setGivedValue(double givedValue) {
        this.givedValue = givedValue;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Public methods
    public void addProduct(Product product, int quantity) {
        if (quantity > 0) {
            int currentQuantity = productQuantities.getOrDefault(product, 0);
            productQuantities.put(product, currentQuantity + quantity);
            this.totalAmount += product.getPrice() * quantity;
        } else {
            JOptionPane.showMessageDialog(null,
                product.getProductName() + " não foi adicionado(a): quantidade inválida.",
                "Quantidade inválida",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void processSale(double givedValue) {
        if (givedValue >= this.getTotalAmount()) {
            JOptionPane.showMessageDialog(null,
                "Compra efetuada com sucesso!\n\nValor recebido: R$ " + givedValue + "\nTroco: R$ " + (givedValue - this.totalAmount) + "\n\nVolte sempre!",
                "Compra processada",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                "Não vendemos fiado!\n\nFaltam R$ " + (-1)*(givedValue - this.totalAmount) + " para fazer a compra.",
                "Compra não processada",
                JOptionPane.INFORMATION_MESSAGE);
        }

        customer.incrementNumberOfPurchases();
    }

    public void showSaleInfo() {
        StringBuilder productList = new StringBuilder();

        for (Map.Entry<Product, Integer> entry : productQuantities.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double totalPrice = product.getPrice() * quantity;

            productList.append(product.getProductName())
                    .append(" ")
                    .append(quantity)
                    .append("x - R$ ")
                    .append(totalPrice)
                    .append("\n");
        }

        JOptionPane.showMessageDialog(null,
                "Caixa: " + this.employee.getPersonName()
                + "\nCliente: " + this.customer.getPersonName()
                + "\n\nProdutos comprados:\n" + productList.toString()
                + "\nTotal: R$ " + this.totalAmount
                + "\n\nTotal de compras do cliente: " + this.customer.getNumberOfPurchases(),
                "Informações da compra",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
