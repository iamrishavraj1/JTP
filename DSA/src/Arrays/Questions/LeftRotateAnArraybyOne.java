package Arrays.Questions;

import java.util.Arrays;
import java.util.*;
public class LeftRotateAnArraybyOne {
    public static void main(String[] args) {
        int[] arr = new int[]{8,5,0,10,0,20};
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        leftRotate(arr);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }
    
    public static void leftRotate(int[] arr){
        int temp = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
