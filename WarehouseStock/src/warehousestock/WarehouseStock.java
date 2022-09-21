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
public class WarehouseStock {
int[][] ItemPrice = new int [1][3]; //Global 2D array for prices
private static final Scanner KB = new Scanner(System.in); //Global scanner for the class


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //object of Warehouse class to call methods in same class
        WarehouseStock ws = new WarehouseStock();
       
        //Welcome Screen for company employees
        System.out.println("========================================================\n"
                + "Welcome to the Warehouse Catalog service\n"
                + "-Building a home? \nLet's help you furnish your kitchen-\n"
                + "\nThis is the INVENTORY DEPARMENT stock management app\n"
                + "Enter (1) to view the menu, or any other key to exit\n"
                + "========================================================\n"
                );

           String launch = KB.next();//storing user choice to proceed or exit
   
     if ("1".equals(launch)) {
         //if - else statement to check the user choice
        ws.start();//calling start() method 
    } 
     else {
         System.exit(0);
     }
        
       
        
    }
    
    public void start(){
    Scanner kb = new Scanner(System.in);
    
    //while loop to display menu until user picks an option
       boolean run = false;
        while(run == false){
            System.out.println("=================================================\n");
        System.out.println("Please select one of the following menu items\n");
        System.out.println("(1) - Update the company database with new stock");
        System.out.println("(2) - View items we have available for our customers");
        System.out.println("(3) - Exit application");
            System.out.println("=================================================\n");
        
        String menuChoice = kb.next();//store user input to be used for switch case
        
        switch(menuChoice){
            //switch case that redirects to relevant screen after checking user input
            case "1": Inventory();break;
            case "2": viewItems();break;
            case "3": Exit();break;
            
    }
        }
    }
    public void Inventory(){
    
        boolean exit = true;
        int userInput;
       
        
        ItemsInStock stock = new ItemsInStock(); //object of ItemsInStock class
       
        Availability status = new Availability(); //object of Availability class
        
        while(exit = true){
            
            stock.Catalog();//calling catalog method and running it within the Inventory()
           
            //for loop to add prices to the 2D array
            for (int[] ItemPrice1 : ItemPrice) {
                for (int j = 0; j < ItemPrice1.length; j++) {
                    System.out.println("Enter the ITEM PRICES BELOW for: \n"
                            + "Flooring choice: " + Arrays.toString(ItemsInStock.floorItem) + "\n"
                                    + "Kitchen choice: " + Arrays.toString(ItemsInStock.kitchenItem) + "\n"
                                            + "Window choice: " + Arrays.toString(ItemsInStock.windowItem) +"\n");
                    userInput = KB.nextInt();//capturing prices entered by user
                    ItemPrice1[j] = userInput;
                    
                    System.out.println("************PRICE SAVED SUCCESSFULLY************");
                    System.out.println("=================================================");
                }
                return;
            }
      
        }
    }

    
    
    public void viewItems(){
    
     ItemsInStock stock = new ItemsInStock(); //object of ItemsInStock class
     
     
     Availability status = new Availability(); //object of Availability class
     
     
     //while loop to return to main menu after the report is displayed
     boolean view = true;
     
     while(view = true){
         
            
         
        System.out.println("****************************************\n"
                + "Current Inventory\n"
                + "****************************************\n");
        System.out.println("Items list and stock level>>\n"
                + Arrays.toString(ItemsInStock.floorItem) +" " + status.getFloorStock() + "\n"
                + Arrays.toString(ItemsInStock.kitchenItem) + " " + status.getKitchenStock() +"\n"
                + Arrays.toString(ItemsInStock.windowItem) + " " + status.getWindowStock() +"\n");
        
        //for loop to output the prices in the array
         System.out.println("Price list >>\n");
         for (int[] ItemPrice1 : ItemPrice) {
             for (int j = 0; j < ItemPrice1.length; j++) {
                 System.out.print(ItemPrice1[j] + " | ");
             }
             System.out.println();
         }
        System.out.println("*****************END OF REPORT*****************");
        return;
     }
    }

    public void Exit() {
        Scanner kb = new Scanner(System.in);
        String exit;
        
        System.out.println("Are you sure you wish to exit the application? (Y) or (N)?");
        exit = kb.next(); //getting user's input
        
        if(exit.equals("Y")){
            //if statement to check user input and exit app
        System.exit(0);
        }
        
    }
}
