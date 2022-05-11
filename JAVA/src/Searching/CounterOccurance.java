package Searching;
import java.util.*;
public class CounterOccurance {
    public static void main(String[] args){
        int[] newArr = {10,20,20,20,30,30};
        int x = 0;
        System.out.println(solution(newArr,x));
        
    }
    static int firstCount(int[] newArr,int x){
        int low =0;
        int high= newArr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(newArr[mid]>x){
                high = mid -1;
            }
            else if(newArr[mid]<x){
              
                low = mid +1;
            }
            else{
                if(mid==0|| newArr[mid-1]!=newArr[mid]){
                    return mid;
                }
                else{
                   high = mid-1;
                }
            }
        }
        return  -1;
    }
    
    static int lastCount(int[] newArr,int x){
        int low =0;
        int high= newArr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(newArr[mid]>x){
                high = mid -1;
            }
            else if(newArr[mid]<x){
             
                low = mid+1;
            }
            else{
                if(mid==newArr.length-1 || newArr[mid]!=newArr[mid+1]){
                    return mid;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
    
    static int solution(int[] newArr,int x){
        int first = firstCount(newArr,x);
        if(first==-1){
            return 0;
        }
        else{
            return (lastCount(newArr,x)-first+1);
        }
    
    }
}
