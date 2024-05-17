import java.io.*;
import java.util.*;

public class Sort01{

  public static void sort01(int[] arr){
    //write your code here  //i to end is unknown 
    int i = 0;      //0 to j-1
    int j = 0;      //j to i-1
    while(i < arr.length){//till i reaches end
        if(arr[i] == 1){
            i++;
        }
        else{
            swap(arr,i,j);
            i++;
            j++;
        }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}