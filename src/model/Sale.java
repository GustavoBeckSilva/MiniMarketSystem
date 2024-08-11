package model;

import java.text.*;
import java.util.*;
import javax.swing.*;

// Auxiliar class
class ProductQuantity {

    // Atributes
    private Product productName;
    private int productQuantity;

    // Constructor
    public ProductQuantity(Product productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    // Getters and setters
    public Product getProduct() {
        return productName;
    }

    public int getQuantity() {
        return productQuantity;
    }

    public double getTotalPrice() {
        return productName.getPrice() * productQuantity;
    }
}

// Main class
public class Sale {

    // Attributes
    private Customer customer;
    private Employee employee;
    private List<ProductQuantity> productQuantities; // Lista de produtos e suas quantidades
    private double totalAmount;

    // Constructor
    public Sale(Customer customer, Employee employee) {
        this.customer = customer;
        this.employee = employee;
        this.productQuantities = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Getters e setters
    public Customer getCustomer() {
        return customer;
    }

    public Employee getSeller() {
        return employee;
    }

    public List<ProductQuantity> getProductQuantities() {
        return productQuantities;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Public methods
    public void addProduct(Product product, int quantity) {
        boolean productFound = false;

        for (int i = 0; i < productQuantities.size(); i++) {

            ProductQuantity productQuantity = productQuantities.get(i);

            if (productQuantity.getProduct().equals(product)) {
                productQuantities.set(i, new ProductQuantity(product, productQuantity.getQuantity() + quantity));
                productFound = true;
                break;
            }
        }

        if (!productFound) {
            productQuantities.add(new ProductQuantity(product, quantity));
        }

        this.totalAmount += product.getPrice() * quantity;
    }

    public void processSale() {
        customer.incrementNumberOfPurchases();
    }

    public void showSaleInfo() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(this.employee.getAdmition());

        StringBuilder productList = new StringBuilder();

        for (ProductQuantity productQuantity : productQuantities) {
            productList.append(productQuantity.getProduct().getProductName())
                    .append(" ")
                    .append(productQuantity.getQuantity())
                    .append("x - R$ ")
                    .append(productQuantity.getTotalPrice() + "\n");
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
