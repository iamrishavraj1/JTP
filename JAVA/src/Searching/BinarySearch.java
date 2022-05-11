package Searching;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        int[] newArr = {1,2,3,4,5};
        int x = 5;
       int low = 0;
       int high = newArr.length-1;
        System.out.println(solution(newArr,x,low,high));
    }
    static int solution(int[] newArr,int x,int low,int high){
     
        while(low<=high){
            int mid = (low+high)/2;
            if(newArr[mid]==x){
                return mid;
            }
            else if (newArr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
