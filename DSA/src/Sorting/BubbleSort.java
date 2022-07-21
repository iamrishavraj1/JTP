package Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,6,77,2};
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        System.out.println("After");
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void sortBubble(int[]arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
                
                }
            }
            if(flag==false){
                break;
            }
        }
        
    }
}
