package Array;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        int[] arr;
        arr = new int[]{1,2,3,4,5};
        int low = 0;
        int high = arr.length-1;
        reverse(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
    
    static void reverse(int[] arr,int low,int high){
      while(low<high){
          int temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;
          low++;
          high--;
      }
    }
}

//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
