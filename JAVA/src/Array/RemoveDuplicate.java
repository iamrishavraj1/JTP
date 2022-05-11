package Array;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr;
        arr = new int[]{1,2,3,3,3,4,5,5};
//        int[] tempArr = new int[arr.length];
        System.out.println(isDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }
    
    static int isDuplicate(int[] arr){
        int res = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
        
        
        
        //Naive Solutionn for find remove the duplicate the elements.
//        tempArr[0] = arr[0];
//        int res = 1;
//        for(int i = 1;i<arr.length;i++){
//            if(tempArr[res-1]!=arr[i]){
//                tempArr[res]=arr[i];
//                res++;
//            }
//        }
//        for(int j = 0;j<res;j++){
//            arr[j]=tempArr[j];
//        }
//        return res;
        //Identify the Duplicate Array;
//        for(int i=0;i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[j]==arr[i]){
//                    arr[j] = 0;
//                }
//            }
//        }
    }
}
