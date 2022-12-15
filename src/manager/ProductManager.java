/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Product;
import java.util.Scanner;


public class ProductManager {
    private Scanner scanner;

    
    public ProductManager(){
        this.scanner = new Scanner(System.in);
    }
    
    public Product addProduct(){
        Product product = new Product();
        System.out.println(" Введите название продукта");
        product.setProductName(scanner.nextLine());
        System.out.println(" Введите цену продукта");
        product.setPrice(scanner.nextInt());scanner.nextLine();
        System.out.println(" Количество продуктов");
        product.setQuantity(scanner.nextInt());
        return product;
    }
    public void printListProducts(Product[] product){
        for (int i = 0; i < product.length; i++) {
            Product pr  = product[i];
            System.out.printf(i+1+".  %s%n",pr.getProductName() +" - "+ pr.getPrice()  + " - "+ pr.getQuantity() );
        }

    }
    
}
