package Searching;
import java.util.*;
public class LastOccurance {
    public static void main(String[] args){
        int[] newArr = {10,15,20,20,40,40};
        int x = 40;
        int low = 0;
        int high = newArr.length-1;
        System.out.println(solution(newArr,low,high,x));
     }
     
     //RECURSIVE SOLN8
//     static int solution(int[] newArr,int low , int high,int x){
//         if(low>high){
//             return -1;
//         }
//        int mid = (low+high)/2;
//
//        if(newArr[mid]>x){
//            return solution(newArr, low, high=mid-1, x);
//        }
//        else if(newArr[mid]<x){
//            return solution(newArr, low=mid+1, high, x);
//        }
//        else{
//            if(mid== newArr.length-1||newArr[mid]!=newArr[mid+1]){
//                return mid;
//            } else{
//                return solution(newArr, mid+1, high, x);
//            }
//        }
//     }
    
    
    static int solution(int[] newArr,int low,int high,int x){
      
        while(low<=high){
            int mid = (low+high)/2;
            if(newArr[mid]>x){
                high = mid-1;
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
        return-1;
    }
}
