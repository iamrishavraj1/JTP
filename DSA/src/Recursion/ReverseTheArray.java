package Recursion;
import java.util.*;
public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int n = arr.length;
//        int low = 0;
//        int high = n-1;
        int i = 0;
        reverseArray(arr,n,i);
        System.out.println(Arrays.toString(arr));
    
        
    }
    public static void reverseArray(int[] arr,int n,int i){
        if(i>=n/2){
            return;
        }
        
        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverseArray(arr,n,i+1);
        
    }
    
//    public static void reverseArray(int[] arr,int n,int low,int high){
//        if(low>=high) {
//            return ;
//        } else {
//            int temp = arr[low];
//            arr[low] = arr[high];
//            arr[high] = temp;
//            reverseArray(arr,n,low+1,high-1);
//        }
//    }
}
