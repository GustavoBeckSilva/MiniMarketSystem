
package model;

import java.util.*;

public class Product {

// atributes
    private int productQuantity;
    private float productPrice;
    private String productCode;
    private String productName;
    private Date productExpirationDate;

// constructor
    public Product(int productQuantity, float productPrice, String productCode, String productName, Date productExpirationDate) {
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productCode = productCode;
        this.productName = productName;
        this.productExpirationDate = productExpirationDate;
    }

// getters and setters
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getProductExpirationDate() {
        return productExpirationDate;
    }

    public void setProductExpirationDate(Date productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }

// public methods
    public void isSpoiled(){}

    public void stockIn(){}

    public void stockOut(){}
    
}
