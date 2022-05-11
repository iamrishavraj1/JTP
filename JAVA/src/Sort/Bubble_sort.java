package Sort;
import java.util.*;
public class Bubble_sort {
    public static void main(String[] args){
        int[] arr = {2,10,8,7};
        
        // Native Solution
//        for(int i = 0;i<arr.length-1;i++){
//            for(int j = 0;j<arr.length-1;j++){
//                if(arr[j]>arr[j+1]){
//                    arr[j] = arr[j] ^ arr[j+1];
//                    arr[j+1] =arr[j] ^ arr[j+1];
//                    arr[j] = arr[j] ^ arr[j+1];
//                }
//            }
//        }
        
        //Iterative Soltuon
//        for(int i = 0;i<arr.length-1;i++){
//            for(int j = 0;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    arr[j] = arr[j] ^ arr[j+1];
//                    arr[j+1] =arr[j] ^ arr[j+1];
//                    arr[j] = arr[j] ^ arr[j+1];
//                }
//            }
//        }
        
        
        //Optimize Solution
        Boolean swap;
        for(int i = 0;i<arr.length-1;i++){
            swap = false;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] =arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                    swap = true;
                }
            }
            if(swap==false){
                break;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
