/**
 * Written by Christopher Walls and Tyler Brack.
 */
public class InsertionSort {
  
  
  public static void main(String[] args) { 
    int j,k,tempElement;
    int[] arr = new int[args.length];
    int i = 0;
    
    for(String str: args){
      arr[i]=Integer.parseInt(str);
      i++;
    }
    for (j=1; j<arr.length; j++){
      k = j-1;
      while (k>=0 && arr[k]>arr[j]){
        tempElement=arr[j];
              arr[j]=arr[k];
              arr[k]=tempElement;
              j=k;
              k--;
              }
  }
  for (int l=0; l<arr.length;l++){
    System.out.print(arr[l]+" ");
  }
  System.out.println("");
  }
  /* ADD YOUR CODE HERE */
  
}
