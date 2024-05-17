import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here, //Applied when many values but less range,Eg- Ranking in Jee
   int range = max - min + 1;
   int[] farr = new int[range];     //farr - frequency array

   for(int i = 0; i < arr.length; i++){     //frequency array
       int idx = arr[i] - min;          
       farr[idx]++;
   }

   for(int i = 1; i < farr.length; i++){        //freq arr to prefix sum array
    farr[i] = farr[i] + farr[i-1];
   } 
   int[] ans = new int[arr.length];

   for(int i = arr.length - 1; i >=0; i--){         //reverse loop in array
       int val = arr[i];                            
       int pos = farr[val - min];                   // eg- 9 will be seen in 6 index, (ele - min)
       int idx = pos - 1;                           // idx is 1 less than pos, 9 is in (15-1=14)idx
       ans[idx] = val;
       farr[val - min]--;                           //decreasing frequency
   }

   for(int i = 0; i < ans.length; i++){
       arr[i] = ans[i];                             // refilling the array by sorted ans
   }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}