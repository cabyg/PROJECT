/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shopdroganov;

import entity.Client;
import entity.Purchase;
import entity.Product;
import java.util.Arrays;
import java.util.Scanner;
import manager.ClientManager;
import manager.ProductManager;
import manager.PurchaseManager;

/**
 *
 * @author pupil
 */
public class App {
    private Client[] clients;
    private Product[] products;
    private Purchase[] purchases; 
    private final ProductManager productManager;
    private final ClientManager clientManager;
    private final Scanner scanner;
    private final PurchaseManager purchaseManager;
    
    public App(){
        scanner = new Scanner (System.in);
        this.products = new Product[0];
        this.clients = new Client[0];
        this.purchases = new Purchase[0]; 
        productManager = new ProductManager();
        clientManager = new ClientManager();
        purchaseManager = new PurchaseManager();
    }
    
    public void run(){
        boolean repeat = true; 
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Spisok zadatch");
            System.out.println("0. Закрыть программу");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Список продуктов");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список зарегестрированных покупателей");
            System.out.println("5. Покупка покупателем продутка");
            System.out.println("6. Доход магазина за все время");
            System.out.println("7. Добавить деньги покупателю");
            System.out.println("Выберите номер задания");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("___________________");
            switch (task){
                case 0: 
                    repeat = false;
                    System.out.println("0. Закрыть программу");
                    break;
                case 1: 
                    ProductManager productmanager = new  ProductManager();
                    System.out.println("1. Добавить продукт");
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = productManager.addProduct();
                    break;
                case 2:
                    System.out.println("2. Список продуктов");
                    productManager.printListProducts(products);
                    
                    break;
                case 3: 
                    System.out.println("3. Добавить покупателя");
                    this.clients =  Arrays.copyOf(this.clients, this.clients.length+1);
                    this.clients[this.clients.length-1] = clientManager.addClient();
                    break;  
                case 4:
                    System.out.println("4. Список зарегестрированных покупателей");
                    clientManager.printListClients(clients);
                    break;
                case 5:
                    /*
                    список клиентов
                    выбор клиента
                    список продуктов 
                    выбор продутка
                    ввести количество продукта
                    создать обьект класса purchase - оформить покупку
                    
                    
                    */
                    System.out.println("Покупка");
                    System.out.println("Customer List");
                    for (int i = 0; i<clients.length;i++){
                        Client client = clients[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Customer{Firstname = %s%n", client.getFirstname());
                        System.out.printf("        {Lastname  = %s%n", client.getLastname());
                        System.out.printf("        {Cash      = %s%n", client.getCash());
                        System.out.println("\t]");
                    }
                    System.out.println("Товары");
                        for (int j = 0; j<products.length;j++){
                        Product productName = products[j];
                        System.out.println("\t[");
                        System.out.printf(j+1+".product{title    = %s%n", productName.getProductName());
                        System.out.printf("      {price    = %s%n", productName.getPrice());
                        System.out.printf("      {quantity = %s%n", productName.getQuantity());    
                        System.out.println("\t]");
                    }
                    //System.out.println("Выберите клиента");
                    //int pur = scanner.nextInt();
                    //System.out.println("Выберите товар");
                    //int pur1 = scanner.nextInt();
                    //int newpur = clients[pur-1].getCash() - products[pur1-1].getPrice();
                    //customers[pur-1].setCash(newpur);
                    //int newpurl = products[pur1-1].getQuantity() - 1;
                    //products[pur1-1].setQuantity(newpurl);
                   

                    //this.history = Arrays.copyOf(this.history, this.history.length+1);
                    //this.history[this.history.length-1] = products[pur1-1].getPrice();
                   
                    //break;
                    //System.out.println("5. покупка покупателем продутка");
                    //clientManager.printListClients(clients);
                    //System.out.println("Выберитье клинта");
                    //int buyer = scanner.nextInt();
                    //productManager.printListProduct(products);
                    //int  buyerproducts = scanner.nextInt();
                    //System.out.println("kolvo");
                    //int quantityproduct = scanner.nextInt();
                    //purchase = clients[buyer-1].getCash() - products[buyerproducts-1] * quantityproduct;
                    //clients[buyer-1].setCash(purchase);
                    //int totalquantity = products[buyerproducts - 1] - quantityproduct;
                    
//                    System.out.println("список покупателей ");
//                    clientManager.printListClients(clients);
//                    int buy1 = scanner.nextInt();
//                    System.out.println("список продуктов ");
//                    for(int j = 0; j< products.length; j++){
//                        System.out.println(j+1);
//                    }
//                    
//                    int buy2 = scanner.nextInt();
//                    int pur = clients[buy1-1].getCash() - products[buy2-1].getPrice();
//                    clients[buy1-1].setCash(pur);
                    this.purchases = Arrays.copyOf(this.purchases,this.purchases.length +1);
                    this.purchases [this.purchases.length -1]= purchaseManager.buyProduct(products, clients);
                    break;
          

                    
                case 6:
                    System.out.println("6. Доход магазина за все время");
                    
                    break;
                case 7:
                    System.out.println("7. Добавить деньги покупателю");
                    System.out.println("Выберите покупателя для передачи денег");
                    System.out.println(" список покупателей");
                    for(int i = 0; i < clients.length; i++){
                        System.out.printf("%d %s %s. money: %s %n",
                                i+1
                                ,clients[i].getFirstname()
                                ,clients[i].getLastname()
                                ,clients[i].getCash()
                        );
                    }
                    
                    int turn = scanner.nextInt();
                    System.out.println("Сколлько денег");
                    int addMoney = scanner.nextInt();
                    int TotalMoney = clients[turn -1].getCash()+ addMoney;
                   clients[turn -1].setCash(TotalMoney);
                    break;
            }
        System.out.println("=======---------========");
        }while(repeat);  
    }
}