/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Product {
    private String productName;
    private int quantity;
    private int price;
    
    public Product() {

    }
        
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" + "productname=" 
                + productName + ", quantity="
                + quantity + ", price=" 
                + price 
                + '}';
    }

    
    public boolean QuantityMinuss(int quantity) {
        if(this.quantity>=quantity){
            this.quantity = this.quantity-quantity;
            return true;
        }
        return false;
    }
    

    
}