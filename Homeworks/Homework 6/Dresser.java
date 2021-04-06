/**
 * Written by Christopher Walls.
 */
import java.util.Scanner;
public class Dresser {
  /**
   * Creates 2d array clothes, NUM_DRAWERS drawers, NUM_ITEMS items each. add, remove, and print clothing in dresser
   */  
  private static int NUM_DRAWERS = 5;
  private static int NUM_ITEMS = 10;
  private Clothing[][] clothes = new Clothing[NUM_DRAWERS][NUM_ITEMS];
  public Dresser () {
    for (int i = 0; i<NUM_DRAWERS; i++){
      for (int j = 0; j<NUM_ITEMS; j++){
        clothes[i][j]=null;
      }
    }
  }
  public void add(Clothing aClothing) {
    int drawer = 0;
    if(aClothing.getType().equalsIgnoreCase("undergarment")){
      int itemCount = 0;
      for (int i = 0; i<NUM_ITEMS; i++){
        if(clothes[drawer][i]!=null){
          itemCount++;
        }
      }
      if(clothes[drawer][itemCount] == null && (itemCount)<NUM_ITEMS){ 
        clothes[drawer][itemCount] = aClothing;
      }
      else if(itemCount>=NUM_ITEMS){
        System.out.println("No more room!");
      }
    }
    if(aClothing.getType().equalsIgnoreCase("socks") || aClothing.getType().equalsIgnoreCase("stockings")){
      int itemCount = 0;
      drawer = 1;
      for (int i = 0; i<NUM_ITEMS; i++){
        if(clothes[drawer][i]!=null){
          itemCount++;
        }
      }
      if(clothes[drawer][itemCount] == null && (itemCount)<NUM_ITEMS){ 
        clothes[drawer][itemCount] = aClothing;
      }
      else if(itemCount>=NUM_ITEMS){
        System.out.println("No more room!");
      }
    }
    if(aClothing.getType().equalsIgnoreCase("top")){
      int itemCount = 1;
      drawer = 2;
      for (int i = 0; i<NUM_ITEMS; i++){
        if(clothes[drawer][i]!=null){
          itemCount++;
        }
      }
      if(clothes[drawer][itemCount] == null && (itemCount)<NUM_ITEMS){ 
        clothes[drawer][itemCount] = aClothing;
      }
      else if(itemCount>=NUM_ITEMS){
        System.out.println("No more room!");
      }
    }
    if(aClothing.getType().equalsIgnoreCase("bottom")){
      int itemCount = 1;
      drawer = 3;
      for (int i = 0; i<NUM_ITEMS; i++){
        if(clothes[drawer][i]!=null){
          itemCount++;
        }
      }
      if(clothes[drawer][itemCount] == null && (itemCount)<NUM_ITEMS){ 
        clothes[drawer][itemCount] = aClothing;
      }
      else if(itemCount>=NUM_ITEMS){
        System.out.println("No more room!");
      }
    }
    if(aClothing.getType().equalsIgnoreCase("cape")){
      int itemCount = 1;
      drawer = 4;
      for (int i = 0; i<NUM_ITEMS; i++){
        if(clothes[drawer][i]!=null){
          itemCount++;
        }
      }
      if(clothes[drawer][itemCount] == null && (itemCount)<NUM_ITEMS){ 
        clothes[drawer][itemCount] = aClothing;
      }
      else if(itemCount>=NUM_ITEMS){
        System.out.println("No more room!");
      }
    }
  }
  public void remove(Clothing rClothing) {
    /**
     * Takes in an instance of Clothing as a parameter and returns nothing.  This method searches for 
     * a piece of clothing, and if it exists it is removed (by setting that value to null).  
     */
    for (int drawer=0; drawer<NUM_DRAWERS; drawer++){
      for (int index=0; index<NUM_ITEMS; index++){
        if(clothes[drawer][index]!=null){
          if(clothes[drawer][index].equals(rClothing)){
            clothes[drawer][index]=null;
            break;
          }
        }
      }
    }
  }
  public void print() {
    for (int i = 0; i < NUM_DRAWERS; i++) {
      System.out.println("Drawer " +i);
      for (int j = 0; j < NUM_ITEMS; j++) {
        if (clothes[i][j]==null){
          continue;  
        }
        if (clothes[i][j]!=null){
          System.out.println(clothes[i][j]);
        }
      }
      System.out.println();
    } 
  }
  
}
