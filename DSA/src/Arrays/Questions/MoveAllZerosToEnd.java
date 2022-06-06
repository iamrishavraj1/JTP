package Arrays.Questions;
import java.util.*;
public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{8,5,0,10,0,20};
        System.out.println("Before");
        System.out.println(Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
        
    }
    
//    public static void moveZeros(int[] arr){
//        int res = 1;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==0){
//                for (int j = i+1; j <arr.length ; j++) {
//                        if(arr[j]!=0){
//                            int temp = arr[i];
//                            arr[i] = arr[j];
//                            arr[j] = temp;
//                        }
//                }
//            }
//
//        }
//
//    }
public static void moveZeros(int[] arr){
    int indexOfNonZero = 0;
    for(int i = 0;i<arr.length;i++){
       if(arr[i]!=0){
        int temp = arr[i];
        arr[i] = arr[indexOfNonZero];
        arr[indexOfNonZero] = temp;
        indexOfNonZero++;
       }
   }
   
}
}
