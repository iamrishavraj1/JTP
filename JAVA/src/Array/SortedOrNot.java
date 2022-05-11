package Array;
import java.util.*;

public class SortedOrNot {
    public static void main(String[] args){
        int[] arr;
        arr = new int[]{12,23,55,2000};
        System.out.println(isSorted(arr));
    }
    
    static boolean isSorted(int[] arr){
 
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
