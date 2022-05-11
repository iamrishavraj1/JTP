package Searching;
import java.util.*;
public class RecursiveBinary {
    public static void main(String[] args) {
        int[] newArr = {1,2,3,4,5};
        int x = 5;
        int low = 0;
        int high = newArr.length-1;
        System.out.println(solution(newArr,x,low,high));
    }
    
    static int solution(int[] newArr, int x,int low,int high){
        int mid = (low+high)/2;
        if(low>high){
            return -1;
        }
        if(newArr[mid]==x){
            return mid;
        }
        else if(newArr[mid]>x){
            return solution(newArr, x, low, high=mid-1);
        }
        else{
            return solution(newArr,x,low=mid+1,high);
        }
    }
}
