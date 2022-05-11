package Array;
import java.util.*;
public class Leaders {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{7,10,4,3,6,5,2};
         findLeaders(arr);
    }
    
    static void findLeaders(int[] arr){
        int cur=arr[arr.length-1];
        System.out.println(cur);
        for(int i = arr.length-1;i>=0;i--){
            if(cur<arr[i]){
            cur = arr[i];
                System.out.println(cur);
            }
        }
        
        
//Naive Solution O(n2)
//        for(int i =0 ;i<arr.length;i++){
//            boolean flag = false;
//          for(int j = i+1;j<arr.length;j++){
//            if(arr[i]<=arr[j]){
//             flag=true;
//                break;
//            }
//
//          }
//          if(flag==false){
//              System.out.println(arr[i]);
//          }
//        }
     
    }
}
