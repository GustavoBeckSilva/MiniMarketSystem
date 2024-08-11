package minimarketsystem;

import model.*;
import java.util.*;

public class MiniMarketSystem {

    public static void main(String[] args) {
        
            Product coffee = new Product("Café", 20.00);
            Product banana = new Product("Banana", 2.0);
                    
            Employee joao = new Employee("João Silva", "Manhã", new Date());
            
            Customer andre = new Customer("André Ribeiro", "123.456.789-00");
        
        Sale venda = new Sale(andre, joao);
        venda.addProduct(coffee, 1);
        venda.addProduct(banana, 2);
        venda.processSale();
        venda.showSaleInfo();
        
        
    }
}
