import java.io.*;
import java.util.*;

public class TargetSumPair {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);       //predefined function to sort array

    int li = 0;         // left index
    int ri = arr.length - 1;        //right index
    while(li < ri){
        if(arr[li] + arr[ri] < target){
            li++;
        } else if(arr[li] + arr[ri] > target){
            ri--;
        } else{
            System.out.println(arr[li] + ", " + arr[ri]);
            li++;
            ri--;
        }
    }
    
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}