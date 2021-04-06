//Written by Christopher Walls.
import java.util.Scanner;
public class MatrixSubtraction {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to the matrix subtracting program.");
    
    //Prompts user for size of matrices
    System.out.print("Please enter the length of the first matrix: ");
    int firstRows = kb.nextInt();
    System.out.print("Please enter the height of the first matrix: ");
    int firstColumns = kb.nextInt();
    int[][] firstMatrix = new int[firstRows][firstColumns];
    System.out.print("Please enter the length of the second matrix: ");
    int secondRows = kb.nextInt();
    System.out.print("Please enter the height of the second matrix: ");
    int secondColumns = kb.nextInt();
    int[][] secondMatrix = new int[secondRows][secondColumns];
    
    //if Matrices are the same size (for subtraction), continue
    if(firstRows==secondRows && firstColumns==secondColumns){
      
      //fill in first matrix
      for (int i = 0; i < firstRows; i++) {
        for (int j = 0; j < firstColumns; j++) {
          System.out.println("Please enter a value for the first matrix space "+(i+1)+","+(j+1));
          firstMatrix[i][j] = kb.nextInt();
        }
      }
      //fill in second matrix
      System.out.println("");
      for (int i = 0; i < secondRows; i++) {
        for (int j = 0; j < secondColumns; j++) {
          System.out.println("Please enter a value for the second matrix space "+(i+1)+","+(j+1));
          secondMatrix[i][j] = kb.nextInt();
        }
      }
      
      System.out.println("");
      
      //print first matrix
      for (int i = 0; i < firstMatrix.length; i++) {
        for (int j = 0; j < firstMatrix[i].length; j++) {
          System.out.print(firstMatrix[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println("-");
      //print second matrix
      for (int i = 0; i < secondMatrix.length; i++) {
        for (int j = 0; j < secondMatrix[i].length; j++) {
          System.out.print(secondMatrix[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println("=");
      
      //subtraction of matrices
      int [][] resultMatrix = new int[firstRows][firstColumns];
      for (int i = 0; i < firstRows; i++) {
        for (int j = 0; j < firstColumns; j++) {
          resultMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
        }
      }
      
      //print result
      for (int i = 0; i < resultMatrix.length; i++) {
        for (int j = 0; j < resultMatrix[i].length; j++) {
          System.out.print(resultMatrix[i][j] + " ");
        }
        System.out.println();
      }
      
      System.out.println("DONE!");
    }//end if
    else{
      System.out.println("Cannot subtract these!");
    }
  }
}