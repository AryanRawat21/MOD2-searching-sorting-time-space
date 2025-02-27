import java.io.*;
import java.util.*;

public class SortDates {

  public static void sortDates(String[] arr) {
    // write your code here
    countSort(arr, 1000000, 100, 32);   //days,i.e.(0-31)
    countSort(arr, 10000, 100, 13);   //months,i.e.(0-12)
    countSort(arr, 1, 10000, 2501 );    //years,i.e.(0-2500)given
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
   // write your code here
    String[] ans = new String[arr.length];
    //make freq array
   int[] farr = new int[range];     //digits always 0 to 10, so farr is 10 size

   for(int i = 0; i < arr.length; i++){      
             //String to integer, use base 10 otherwise machine will consider eg-057 as octal no.
       farr[Integer.parseInt(arr[i], 10) / div % mod]++;     //diff div and modulus everytime             //min is 0 and divide by exponent and modulus by 10
   }

   for(int i = 1; i < farr.length; i++){        //freq arr to prefix sum array
    farr[i] = farr[i] + farr[i-1];
   } 

   for(int i = arr.length - 1; i >=0; i--){         //stable sorting(filling ans array)
                                   
       int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;              
        ans[pos] = arr[i];
       farr[Integer.parseInt(arr[i], 10) / div % mod]--;                           
   }

   for(int i = 0; i < arr.length; i++){
       arr[i] = ans[i];                             // filling the array with help of ans array
   }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}
