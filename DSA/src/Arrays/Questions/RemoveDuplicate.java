package Arrays.Questions;

import java.util.Arrays;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,20,30,30,30,30};
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        removeDup(arr);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
        
    }
    
//    public static int removeDup(int[] arr){
//        int[] temp = new int[arr.length];
//        temp[0] = arr[0];
//        int res = 1;
//        for(int i = 1;i<arr.length;i++){
//            if(temp[res-1]!=arr[i]){
//                temp[res]=arr[i];
//                res++;
//            }
//        }
//        for(int j = 0;j<res;j++){
//            arr[j]=temp[j];
//
//        }
//        return res;
public static int removeDup(int[] arr){
   int res = 1;
    for (int i = 1; i < arr.length; i++) {
        if(arr[i]!=arr[res-1]){
            arr[res] = arr[i];
            res++;
        }
    }
    return res;
    }
}
