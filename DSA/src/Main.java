//package Arrays;
//import java.util.*;
//public class Operations {
//    public static void main(String[] args) {
////        int[] arr = new int[3];
////        arr[0] = 5; arr[1] = 10; arr[2] = 20;
//        int arr[] = {3, 8, 12, 5, 6}, k = 12, n = 5;
//
//        int cap = 5;
//        System.out.println("Before");
//        for (int i = 0; i < n-2 ; i++) {
//            System.out.println(Arrays.toString(arr));
//        }
////        System.out.println(searchingElement(arr,k));
////        int k = 10;
//        int pos =2;
//        System.out.println("AFTER");
////        n = insertElement(arr,k,cap,pos,n);
//        n= deleteElement(arr,k,n);
//        for (int i = 0; i < n-1 ; i++) {
//            System.out.println(Arrays.toString(arr));
//        }
//    }
//    public static int searchingElement(int[] arr,int k){
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i]==k){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static int insertElement(int[] arr,int k,int cap,int pos,int n){
//        if(n==cap){
//            return n;
//        }
//        int indexOfK = pos-1;
//        for (int i = n-1; i>=indexOfK; i--) {
//            arr[i+1]=arr[i];
//        }
//        arr[indexOfK]=k;
//        return n +1;
//    }
//
//    public static int deleteElement(int [] arr,int k,int n){
//        int i;
//        for( i = 0;i<n;i++){
//            if(arr[i]==k){
//                break;
//            }
//        }
//        if(i==k){
//            return n;
//        }
//        for (int j = i; j <n-1 ; j++) {
//            arr[j]=arr[j+1];
//        }
//        return arr[n-1]=0;
//    }
//
//}
