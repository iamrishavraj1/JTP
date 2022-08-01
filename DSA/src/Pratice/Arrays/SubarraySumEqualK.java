package Pratice.Arrays;
import java.util.*;
public class SubarraySumEqualK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1};
        int k = 2;
        System.out.println(ans(arr,k));
    }
    
    //Brute Force...
//    static int ans(int[] arr,int k){
//        int count =0;
//        for (int i = 0; i <arr.length ; i++) {
//            int sum=0;
//            for (int j = i; j <arr.length ; j++) {
//                sum+=arr[j];
//                if(sum==k){
//                    count++;
//                }
//            }
//
//
//        }
//        return count;
//    }
    
    static int ans(int[]arr,int k){
        HashMap<Integer,Integer> prevSum = new HashMap<>();
        prevSum.put(0,1);
        int count = 0;
        int currSum = 0;
        for (int i = 0; i <arr.length ; i++) {
            currSum+=arr[i];
            int removeSum = currSum-k;
//            System.out.println(removeSum);
//            System.out.println("BREAK");
            if(prevSum.containsKey(removeSum)){
//                System.out.println(prevSum.containsKey(removeSum));
                count+=prevSum.get(removeSum);
            }
            
            prevSum.put(currSum,prevSum.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}
