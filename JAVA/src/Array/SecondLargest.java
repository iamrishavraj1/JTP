package Array;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        int[] arr;
        arr = new int[]{10,20,40,221,999};
        System.out.println(SecondLar(arr));
    }
    static int LargestEle(int[] arr){
        int res = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
    }
    static int SecondLar(int[] arr){
        int res1 = -1;
        int largest = LargestEle(arr);
        for(int k = 0;k<arr.length;k++){
           if(arr[k]!=arr[largest]){
               if(res1==-1){
                   res1 = k;
               }
               else if(arr[k]>arr[res1]){
                   res1 = k;
               }
           }
        }
        return arr[res1];
    }
}
