package Arrays.Questions;
import java.util.*;
public class FindLeaders {
    public static void main(String[] args) {
        int[] arr = new int[]{7,10,4,10,6,5,2};
        int n = arr.length;
        leaders(arr,n);
        
   
    }
    
//    public static void leaders(int[] arr,int n){
//        for (int i = 0; i < n; i++) {
//            boolean flag = false;
//            for (int j = i+1; j <n ; j++) {
//                if(arr[i]<=arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag==false){
//                System.out.println(arr[i]);
//            }
//
//        }
//
//    }
public static void leaders(int[] arr,int n){
   int currLeader = arr[n-1];
    System.out.println(currLeader);
    for (int i = n-2; i>=0 ; i--) {
        if(currLeader < arr[i]){
            currLeader = arr[i];
            System.out.println(currLeader);
        }
    }
    
}
    
}
