import java.io.*;
import java.util.*;

public class PivotSortedRotatedArray {

  public static int findPivot(int[] arr) {
    // write your code here
    int lo = 0;
    int hi = arr.length - 1;

while(lo < hi){          // minimum 2 elements req in array
    int mid = (lo + hi) / 2;
    if(arr[mid] < arr[hi]){     //val inc from mid to hi
        hi = mid;               // pivot in lest half
    }else {
         lo = mid + 1;                       // pivot in right half
    }  
}
    return arr[hi];
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  }

}