package lv.rigacoding.day3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristaps
 */
public class SpeedCalculator {
    public SpeedCalculator(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lūdzu ievadi noskrieto distanci(m): ");
        int distance = input.nextInt();
        
        System.out.println("Lūdzu ievadi skriešanas laiku:");
        int hours = input.nextInt();
        
        int minutes = input.nextInt();
        
        int seconds = input.nextInt();
        
        int totaltime2 = getTotalTime(hours, minutes, seconds);
                      
        getSpeed(totaltime2, distance);
        
        getSpeedKMH(totaltime2, distance);
        
        getMiles(distance);
        
    }
    
    public int getTotalTime(int hours, int minutes, int seconds){
        int totaltime = hours*3600+minutes*60+seconds;
        System.out.println("Kopējais laiks = " + totaltime);
        return totaltime;
    }
    public void getSpeed(int totaltime, int distance){
        double speed = (double)distance / (double)totaltime;
        double roundedSpeed = Math.round(speed * 100.0) / 100.0;
        System.out.println("Vidējais ātrums m/s = " + roundedSpeed);
                
    }
         
    public void getSpeedKMH(int totaltime, int distance){
        double speedKMH = (double)distance/1000/(double)totaltime/(60*60);
        double roundedKMH = Math.round(speedKMH * 100.0) / 100.0;
        System.out.println("Vidējais ātrums km/h = " + roundedKMH);
               
    }
    
     public void getMiles( int distance){
        double Miles = distance * 0.621371;
        double roundedMiles = Math.round(Miles * 100.0) / 100.0;
        System.out.println("Noskrietasi attālums Jūdzēs = " + roundedMiles);
               
    }

   
    
   
}
