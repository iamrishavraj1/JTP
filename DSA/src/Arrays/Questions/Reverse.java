package Arrays.Questions;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = new int[]{5,8,20,10};
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void reverseArr(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           low++;
           high--;
           
        }
       
    }
}
