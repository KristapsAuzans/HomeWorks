/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworks;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class TaskBuilder {
     public static void weirdTriangle(){
     Scanner input = new Scanner(System.in);
        System.out.println("Ievadi jebkādu skaitli N: ");
        int n = input.nextInt();
        String empty = " ";
        String star = "*";
        int numberOfRows = 2*n-1;       
     
      for (int row = 1; row <= n; row++){
          int starCount = 2*row-1;
          int emptyCount = ((2*n-1)-starCount)/2;  
          for (int collum = 1; collum <=emptyCount; collum++){
                           
     System.out.print(empty);
     }
         
          for (int collum = 1; collum <=starCount; collum++){
                           
     System.out.print(star);
     }
               
         System.out.println(); 
          
     }
            
          for (int row = n-1; row > 0; row--){
          int starCount = 2*row-1;
          int emptyCount = ((2*n-1)-starCount)/2;  
          for (int collum = 1; collum <=emptyCount; collum++){
                           
     System.out.print(empty);
     }
         
          for (int collum = 1; collum <=starCount; collum++){
                           
     System.out.print(star);
     }
               
         System.out.println(); 
          
     } 
       
      
     }
}
