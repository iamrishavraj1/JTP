package Array;
import java.util.*;
public class MaximumDiffwithOrd {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{30,10,8,2};
        maxDiff(arr);
   
        
    }
    static void maxDiff(int[] arr){
        int max = arr[1]-arr[0];
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++) {
                if (arr[j] - arr[i] > max) {
                    max = arr[j] - arr[i];
                   
                }
            }
        }
        System.out.println(max);
    }
}
