/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class eShop {

    private static Scanner input = new Scanner(System.in);

    public static void ShopList() {
        ArrayList<ProductDescription> product = new ArrayList<ProductDescription>();
        product.add(new ProductDescription("Dators", 900));
        product.add(new ProductDescription("Bikses", 50));
        product.add(new ProductDescription("Auto", 10000));
        product.add(new ProductDescription("Mobilais", 200));
        product.add(new ProductDescription("TV", 550));
        product.add(new ProductDescription("Koferis", 100));
        product.add(new ProductDescription("Cimdi", 20));
        product.add(new ProductDescription("Cepure", 10));

        System.out.println("Šis ir mūsu veikala piedāvājumu klāsts, lai ko iegādātos, raksti preces nosaukumu. Ja esi gatavs maksāt, raksti 'O'");
        System.out.println();
        for (ProductDescription random1 : product) {

            System.out.println(String.format("%-15s= %s", random1.getName(), random1.getPrice()) + " USD");

        }

        
        int totalPrice = 0;
        boolean end = true;
        
        
        do {
            boolean isOk = false;
           String name = input.next();
            
            for (ProductDescription random1 : product) {
                 
                if (name == null ? random1.getName() == null : name.equals(random1.getName())) {
                    totalPrice =totalPrice + random1.getPrice();
                    System.out.println("Kopējā cena: " + totalPrice + " USD");
                    
                    System.out.println("Izvēlies nākamo preci vai raksti '0', lai veiktu pirkumu ");
                    isOk = true;
                    end = true;
                    break;             
                }
            }
            
               if (isOk == false && !"0".equals(name)) {
                System.out.println("Nepareizi ievadīta prece, mēģini vēlreiz ");
                end = true;
                }
               
            if ("0".equals(name)){
                end = false;
            }
                           
                   
                       
        } while (end == true);
        System.out.println("Kopējā cena: " + totalPrice + " USD");
    }

}
