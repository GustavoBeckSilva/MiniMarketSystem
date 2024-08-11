package minimarketsystem;

import model.*;
import java.util.*;

public class MiniMarketSystem {

    public static void main(String[] args) {

        Product cafe = new Product("Café", 20.00);
        Product banana = new Product("Banana", 2.00);
        Product arroz = new Product("Arroz", 25.00);
        Product feijao = new Product("Feijão", 7.50);
        Product leite = new Product("Leite", 5.00);
        Product pao = new Product("Pão", 8.00);
        Product carne = new Product("Carne", 50.00);
        Product batata = new Product("Batata", 3.00);
        Product tomate = new Product("Tomate", 6.00);
        Product queijo = new Product("Queijo", 15.00);

        cafe.showProductInfo();

        Employee joao = new Employee("João Silva", "986.543-210-12", "Manhã", new Date());
        Employee maria = new Employee("Maria Oliveira", "123.456.789-01", "Tarde", new Date());
        Employee carlos = new Employee("Carlos Souza", "234.567.890-02", "Noite", new Date());
        Employee ana = new Employee("Ana Santos", "345.678.901-03", "Manhã", new Date());
        Employee pedro = new Employee("Pedro Lima", "456.789.012-04", "Tarde", new Date());

        pedro.showInformation();
        
        Customer andre = new Customer("André Ribeiro", "123.456.789-00");
        Customer julia = new Customer("Júlia Costa", "234.567.890-11");
        Customer fernando = new Customer("Fernando Rocha", "345.678.901-22");
        Customer isabela = new Customer("Isabela Martins", "456.789.012-33");
        Customer luiza = new Customer("Luiza Almeida", "567.890.123-44");

        luiza.showInformation();

        Sale venda1 = new Sale(andre, joao);
        venda1.addProduct(cafe, 1);
        venda1.addProduct(pao, 2);
        venda1.showSaleInfo();
        venda1.processSale(36.0);


        Sale venda2 = new Sale(julia, maria);
        venda2.addProduct(feijao, 3);
        venda2.addProduct(arroz, 1);
        venda2.showSaleInfo();
        venda2.processSale(47.5);


        Sale venda3 = new Sale(fernando, carlos);
        venda3.addProduct(carne, 1);
        venda3.addProduct(batata, 5);
        venda3.showSaleInfo();
        venda3.processSale(65.0);


        Sale venda4 = new Sale(isabela, ana);
        venda4.addProduct(leite, 10);
        venda4.addProduct(queijo, 1);
        venda4.showSaleInfo();
        venda4.processSale(65.0);

        
        Sale venda5 = new Sale(luiza, pedro);
        venda5.addProduct(tomate, 5);
        venda5.addProduct(banana, 10);
        venda5.showSaleInfo();
        venda5.processSale(40.0);


        Sale venda6 = new Sale(andre, joao);
        venda6.addProduct(pao, 4);
        venda6.addProduct(queijo, 2);
        venda6.showSaleInfo();
        venda6.processSale(46.0);


        Sale venda7 = new Sale(julia, maria);
        venda7.addProduct(arroz, 2);
        venda7.addProduct(feijao, 4);
        venda7.showSaleInfo();
        venda7.processSale(70.0);

        Sale venda8 = new Sale(fernando, carlos);
        venda8.addProduct(cafe, 2);
        venda8.addProduct(leite, 3);
        venda8.showSaleInfo();
        venda8.processSale(55.0);

        Sale venda9 = new Sale(isabela, ana);
        venda9.addProduct(batata, 10);
        venda9.showSaleInfo();
        venda9.processSale(80.0);

        Sale venda10 = new Sale(luiza, pedro);
        venda10.addProduct(tomate, 3);
        venda10.addProduct(carne, 1);
        venda10.showSaleInfo();
        venda10.processSale(56.0);
        
    }
}
