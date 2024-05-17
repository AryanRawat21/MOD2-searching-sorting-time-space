import java.io.*;
import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    // finding max value
    int max = Integer.MIN_VALUE;
    for(int val: arr){
        if(val > max){
            max = val;
        }
    }
// first sort for 10,then 100, till exponent is less than max
    int exp = 1;
    while(exp<=max){
        countSort(arr,exp);
        exp = exp * 10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
     int[] ans = new int[arr.length];
    //make freq array
   int[] farr = new int[10];     //digits always 0 to 10, so farr is 10 size

   for(int i = 0; i < arr.length; i++){      
                
       farr[arr[i] / exp % 10]++;                  //min is 0 and divide by exponent and modulus by 10
   }

   for(int i = 1; i < farr.length; i++){        //freq arr to prefix sum array
    farr[i] = farr[i] + farr[i-1];
   } 

   for(int i = arr.length - 1; i >=0; i--){         //stable sorting(filling ans array)
                                   
       int pos = farr[arr[i] / exp % 10] - 1;              
        ans[pos] = arr[i];
       farr[arr[i] / exp % 10]--;                           
   }

   for(int i = 0; i < arr.length; i++){
       arr[i] = ans[i];                             // filling the array with help of ans array
   }
  
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}