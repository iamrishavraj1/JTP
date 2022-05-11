package Searching;
import java.util.*;
public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 15, 20, 20, 20};
    int x = 20;
    int low = 0;
    int high = arr.length-1;
//        System.out.println(solution(arr,x,low,high));
        System.out.println(test(arr,low,high,x));
    }
    //Naive Solution
//    static int solution(int[] arr, int x){
//        for(int i = 0;i< arr.length-1;i++){
//            if(arr[i]==x){
//                return i;
//            }
//        }
//        return -1;
//    }
    
    
    //Using Binary Search
//    static int solution(int[]arr, int x,int low,int high){
//        int mid = (low+high)/2;
//        if(low>high)
//            return -1;
//
//     if(arr[mid]>x)
//          return solution(arr, x, low, high=mid-1);
//     else if(arr[mid]<x)
//         return solution(arr,x,low=mid+1,high);
//        else{
//            if(mid==0 || arr[mid-1]!=arr[mid])
//                return mid;
//            else{
//                return solution(arr,x,low,high=mid-1);
//            }
//        }
//
//
//    }
    
//    static int solution(int[] arr,int x,int low,int high){
//        while(low<=high){
//            int mid= (low+high)/2;
//
//            if(arr[mid]>x){
//                high = mid-1;
//            }
//            else if(arr[mid]<x){
//                low = mid+1;
//            }
//            else{
//                if(mid==0|| arr[mid-1]!=arr[mid]){
//                    return mid;
//                } else{
//                    high = mid-1;
//                }
//            }
//        }
//        return -1;
//    }
    
    
    static int test(int[] arr,int low,int high,int x){
        int mid = (low+high)/2;
        if(low>high)
            return -1;
        if(arr[mid]>x){
            return test(arr,low,high=mid-1,x);
        }
        else if(arr[mid]<x){
            return test(arr,low=mid+1,high,x);
        }
        else{
            if(mid==0 || arr[mid-1]!=arr[mid]){
                return mid;
            } else {
                return test(arr,low,high=mid-1,x);
            }
        }
    }
}
