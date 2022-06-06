package Arrays.Questions;
import java.util.*;
public class CheckSortedArr {
    public static void main(String[] args) {
        int[] arr = new int[]{7,20,30,10};
        System.out.println(checkSort(arr));
        
    }
    
//    public static Boolean checkSort(int[] arr){
//        for (int i = 0; i <arr.length ; i++) {
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[j]<arr[i]){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
public static Boolean checkSort(int[] arr){
    for (int i = 1; i <arr.length ; i++) {
        if(arr[i]<arr[i-1]){
            return false;
        }
    }
    return true;
}
}
