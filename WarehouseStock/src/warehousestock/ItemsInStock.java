/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousestock;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Samkelo Tshabalala
 */

public class ItemsInStock {
    //Arrays for capturing stock items
   public static String[] kitchenItem = new String[1];
   public static String[] floorItem = new String[1];
   public static String[] windowItem = new String[1]; 
    
   //Global scanner for the whole class
    private static final Scanner KB = new Scanner(System.in);
    
    
    public void Catalog(){
        //catalog method capturing stock
        
        boolean Y = true;
    Availability status = new Availability(); //Instance of Availablity class to allow access to get and set methods
    
    
        while(Y = true){
            //while loop to return to main menu after items have been captured
         System.out.println("=================================================\n"
                + "From the following list, enter a FLOORING ITEM to capture in stock\n"
               + " Tiles\n Carpets\n Hardwood flooring \n");
        
         Arrays.fill(floorItem, KB.next());//saving user choice in floorItem array
         
         System.out.println("\nWhat is the current STOCK LEVEL for: " + Arrays.toString(floorItem));
            System.out.println("Enter: Available, Low, or Unavailable >>\n");
            status.setFloorStock(KB.next()); //set method capturing status picked by user
         
         
         
         System.out.println("\nFrom the following list, enter a KITCHEN ITEM to capture in stock\n"
               + " Counter-tops\n Sinks\n Cupboards\n");
        
         Arrays.fill(kitchenItem, KB.next());//saving user choice in kitchenItem array
         
         System.out.println("\nWhat is the current STOCK LEVEL for: " + Arrays.toString(kitchenItem));
            System.out.println("Enter: Available, Low, or Unavailable >>\n");
            status.setKitchenStock(KB.next());//set method capturing status picked by user
         
         System.out.println("\nFrom the following list, enter a WINDOW ITEM to capture in stock\n"
               + " Blinds\n Curtains\n Drapes\n");
       
         Arrays.fill(windowItem, KB.next());//saving user choice in windowItem array
         
         System.out.println("\nWhat is the current STOCK LEVEL for: " + Arrays.toString(windowItem));
            System.out.println("Enter: Available, Low, or Unavailable >>\n");
            status.setWindowStock(KB.next());//set method capturing status picked by user
         
         System.out.println("=================================================\n");
        return;}
    }
   
}
