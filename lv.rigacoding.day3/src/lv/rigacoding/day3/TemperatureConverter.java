/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day3;

import java.util.Scanner;

/**
 *
 * @author Kristaps
 */
public class TemperatureConverter {
    public TemperatureConverter(){
    Scanner input = new Scanner(System.in);
        
    System.out.println("Lūdzu ievadi temperatūru: ");
    int temperature = input.nextInt();
        
    System.out.println("Norādī, kādu temperatūru tu ievadīji norādi \"F\" or \"C\": ");
    char value = input.next().charAt(0);
       
    if (value == 'F'|| value == 'f'){
        toFarenheit (temperature);
        return ;
        }
                
    else if (value == 'C'|| value == 'c'){
          toCelsius (temperature);
        } 
    }
    
    
   private double toFarenheit (int temperature ){
    double ConvertedC = ((double)temperature - 32 )* 5/9;
    double roundedConvertedC = Math.round(ConvertedC * 100.0) / 100.0;
    System.out.println("Temperatūra pēc Farenheita skalas ir " + roundedConvertedC);
    return roundedConvertedC;
    
    }
   
   private double toCelsius (int temperature){
    double ConvertedF = (double)temperature * 9/5+32;
    double roundedConvertedF = Math.round(ConvertedF * 100.0) / 100.0;
    System.out.println("Temperatūra pēc Celsija skalas ir " + roundedConvertedF);
    return roundedConvertedF;
    
    }
}
