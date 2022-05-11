package Array;
import java.util.*;
public class LeftRotatebyOne {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{12,14,56,78,32};
        
        leftbyone(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void leftbyone(int[] arr){
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
