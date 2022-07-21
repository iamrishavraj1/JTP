package Searching;
import java.util.*;
public class FindIndexOfFirstOccurence {
    public static void main(String[] args) {
        int[] arr = new int[]{1,10,10,10,20,20,40};
        int x = 20;
        int low = 0;
        int high = arr.length-1;
        System.out.println(findIndex(arr,x,low,high));
        
    }
    
    public static int findIndex(int[]arr,int x,int low,int high){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                high = mid-1;
            } else if (arr[mid]<x){
                low = mid+1;
            } else {
                if(mid == 0 || arr[mid-1]!=arr[mid]){
                    return mid;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
