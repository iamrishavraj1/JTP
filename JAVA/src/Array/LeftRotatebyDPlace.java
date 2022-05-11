package Array;
import java.util.*;
public class LeftRotatebyDPlace {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1,2,3,4,5};
        int pos = 3;
  leftDplace(arr,pos);
        System.out.println(Arrays.toString(arr));
    }
    
//    static void leftby2place(int[] arr){
//        int temp = arr[0];
//        for(int i = 1;i<arr.length;i++){
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length-1]=temp;
//    }
//
//    static void leftDTime(int[] arr,int pos){
//        for(int i = 0;i<pos;i++){
//            leftby2place(arr);
//        }
//    }
    
    static void leftDplace(int[] arr,int pos){
        int[] temp = new int[pos];
        for(int i = 0;i<pos;i++){
            temp[i] = arr[i];
        }
        for(int i =pos;i<arr.length;i++){
            temp[i-pos]=arr[i];
        }
        for(int i =0;i<pos;i++){
            arr[arr.length-pos+i] = temp[i];
        }
    }
    
}
