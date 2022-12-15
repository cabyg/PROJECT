/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Client;
import entity.Product;
import entity.Purchase;
import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 *
 * @author pupil
 */
public class PurchaseManager {
    private final Scanner scanner = new Scanner(System.in);
    
    
    public Purchase buyProduct(Product[] products, Client[] clients){
        //список клиентов
        //выбираем номер клиента
        //список продуктов
        //клиент выбирает номер продукта из списка
        //создается обькт покупка и вносит туда клиента количестово цена продукт
        
        //вносит изменения колчеиство продукта
        //вноситься измение кошелек клиента
        //сохраяет массив покупок 
        //отнимается суммму из кошелька
        Purchase purchase = new Purchase();
        
        System.out.println("Список продуктов: ");
        ProductManager productManager = new ProductManager();
        productManager.printListProducts(products);
        System.out.print("Выберите номер продукта: ");
        int numberProduct = scanner.nextInt(); scanner.nextLine();
        
        System.out.println("Список покупателей: ");
        ClientManager clientManager = new ClientManager();
        clientManager.printListClients(clients);
        
        
        System.out.print("Выберите номер покупателя из списка: ");
        int numberClient = scanner.nextInt(); scanner.nextLine();
        int quantity = scanner.nextInt();
        if(!products[numberProduct - 1].QuantityMinuss(quantity)){
            return null;
        }
        purchase.setProduct(products[numberProduct - 1]);
        //purchase.setBuyProduct(new ());
        return purchase;
    }

    
}
