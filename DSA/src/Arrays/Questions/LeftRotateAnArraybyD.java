package Arrays.Questions;

import java.util.*;
public class LeftRotateAnArraybyD {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println(n);
        int d = 2;
        leftRotateD(arr,n,d);
        
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }
//    public static void leftRotateD(int[] arr,int n,int d){
//        for (int i = 0; i <d ; i++) {
//        leftRotate(arr,n);
//        }
//    }
//
//    public static void leftRotate(int[] arr,int n){
//        int temp = arr[0];
//        for (int i = 1; i <n ; i++) {
//            arr[i-1] = arr[i];
//        }
//        arr[n-1] = temp;
//    }
    
    public static void leftRotateD(int[] arr,int n,int d){
        int[] temp = new int[d];
        for(int i =0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int j = d;j<n;j++){
            arr[j-d]= arr[j];
        }
        for(int k = 0;k<d;k++){
            arr[n-d+k]=temp[k];
        }
    }
}
