import java.util.*;
import java.io.*;

public class InsertionSortMain{
  
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Hi");
    
    
    
    public static in countUpper(ArrayList<Sring>)
    
  }
  /*
  Best case, alreadt sorted = O(n)
  OR everything in the arry is some constant disatacne away ie 0 
  avg: O(n^2)
  */
  public static void insertionSort(int[] arr){
  for(int i =1; i < arr.length; i++){
  int key = arr[i];
    int loc = i-1;
    while(loc>= 0 && key < arr[loc]){
    arr[loc+1]= arr[loc];
      loc--;
    }
    arr[loc+1] = key;
  
  }
  
  
  }
  
  
  

  
}
