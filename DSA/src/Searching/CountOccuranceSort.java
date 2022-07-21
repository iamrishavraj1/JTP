package Searching;
import java.util.*;
public class CountOccuranceSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,20,20,30,30};
        int x = 10;
        int low = 0;
        int high = arr.length-1;
        System.out.println(countOcc(arr,x,low,high));
    }
    
    public static int countOcc(int[] arr,int x,int low,int high){
        int first = firstIndex(arr,x,low,high);
         if(first==1){
        return 0;
        } else{
        return LastIndex(arr,x,low,high)-first+1;
        }

    }
    
    public static int firstIndex(int[] arr,int x,int low,int high){
        int mid = (low+high)/2;
        System.out.println(mid);
        while(low<=high){
        if(arr[mid]<x){
            low = mid+1; // low = 0 and mid = 3 then low = 3 + 1 = 4;
        } else if(arr[mid]>x){
            high = mid-1;
        } else{
            if(mid==0 || arr[mid-1]!=arr[mid]) {
                return mid; // mid = 0 or arr[3-2]!=arr[3] = arr[1]=10 is not equal to arr[3] = 10;
            } else{
                high = mid-1;
            }
        }
        }
        return -1;
    }
    public static int LastIndex(int[] arr,int x,int low,int high){
        int mid = (low+high)/2;
        System.out.println(mid);
        while(low<=high){
            if(arr[mid]==x) return mid;
            else if(arr[mid]<x){
                low = mid+1; // low = 0 and mid = 3 then low = 3 + 1 = 4;
            } else if(arr[mid]>x){
                high = mid-1;
            } else{
                if(mid==arr.length-1 || arr[mid+1]!=arr[mid]) {
                    return mid; // mid = 0 or arr[3-2]!=arr[3] = arr[1]=10 is not equal to arr[3] = 10;
                } else{
                   low = mid+1;
                }
            }
        }
        return -1;
    }
    
}
