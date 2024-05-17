import java.io.*;
import java.util.*;

public class PartitionInArray {
    public static void partition(int[] arr, int pivot) {
        // 0 to j-1 <= pivot
        // j to i-1 > pivot
        // i to end = unknown
      int i = 0;
      int j = 0;
      while(i<arr.length){          //when unknown
          if(arr[i] > pivot){       //greater area increases
              i++;                  
          } else{                   //lesser than or equal area increases
              swap(arr, i, j);
              i++;
              j++;
          }
      }
    }
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        partition(arr, pivot);
        print(arr);
    }
}

// RAJNEESH WAY

//         int p = -1;
//         int itr = 0;
//         while (itr < n) {
//             if (arr[itr] <= pivot)
//                 swap(arr, itr, ++p);
//             itr++;
//         }
//     }

//     public static void swap(int[] arr, int i, int j) {
//         System.out.println("Swapping " + arr[i] + " and " + arr[j]);
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         int pivot = scn.nextInt();
//         partition(arr, pivot);
//         print(arr);
//     }
// }