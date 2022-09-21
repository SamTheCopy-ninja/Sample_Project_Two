/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousestock;

/**
 *
 * @author Samkelo Tshabalala
 */
public class Availability extends ItemsInStock {
    //subclass of ItemsInStock
    
    //private variables for stock levels
  private static String floorStock;
  private static String kitchenStock;
  private static String windowStock;

  //get and set methods for stock levels
    public String getFloorStock() {
        return floorStock;
    }

    public void setFloorStock(String floorStock) {
        this.floorStock = floorStock;
    }

    public String getKitchenStock() {
        return kitchenStock;
    }

    public void setKitchenStock(String kitchenStock) {
        this.kitchenStock = kitchenStock;
    }

    public String getWindowStock() {
        return windowStock;
    }

    public void setWindowStock(String windowStock) {
        this.windowStock = windowStock;
    }

    
}
