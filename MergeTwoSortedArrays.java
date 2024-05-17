import java.io.*;
import java.util.*;

public class MergeTwoSortedArrays {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
  int[] res = new int[a.length + b.length];   
    
  int i = 0;
  int j = 0; 
  int k = 0;
  
  while(i<a.length && j<b.length){
      if(a[i] < b[j]){
          res[k] = a[i];
          i++;
          k++;               //if anyone of the array is bigger it inc and k also increases
      } else{
          res[k] = b[j];
          j++;
          k++;
      }
  }

  while(i<a.length){    // if one array finishes but other is remaining
      res[k] = a[i];
      i++;
      k++;
  }
 
  while(j < b.length){
      res[k] = b[j];
      j++;
      k++;
  }
    return res;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}


// //WORKING CODE(RAJNEESH WAY)

// import java.io.*;                   
// import java.util.*;
// // this method has the best complexity of (2*min(n*m) + m) units of operation.
// public class MergeTwoSortedArrays {
//     public static int[] mergeTwoSortArray(int[] arr1, int[] arr2) {
//         int i = 0, j = 0, k = 0;
//         int n = arr1.length;
//         int m = arr2.length;
//         int[] ans = new int[n + m];

//         while (i < n && j < m) {
//             if (arr1[i] < arr2[j])
//                 ans[k++] = arr1[i++];
//             else
//                 ans[k++] = arr2[j++];
//         }

//         while (i < n)
//             ans[k++] = arr1[i++];
//         while (j < m)
//             ans[k++] = arr2[j++];

//         return ans;
//     }

//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int m = scn.nextInt();
//         int[] arr1 = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr1[i] = scn.nextInt();
//         }

//         int[] arr2 = new int[m];
//         for (int J = 0; J < m; J++) {
//             arr2[J] = scn.nextInt();
//         }
//         int[] mergedArray = mergeTwoSortArray(arr1, arr2);
//         print(mergedArray);
//     }
// }
