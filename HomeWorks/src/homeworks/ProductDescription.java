/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworks;

/**
 *
 * @author Kristaps
 */
public class ProductDescription {
    
    // 2,3,.... J,Q, K
    private String name;
    //H, S, D, C
    private int price;
public ProductDescription(String name, int price){
        this.name  = name;
        this.price = price;
        
}

    public String getName() {
        return name;
    }

   

    public int getPrice() {
        return price;
    }

   



}
