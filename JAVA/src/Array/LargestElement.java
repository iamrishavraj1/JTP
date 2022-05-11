package Array;
import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        arr = new int[]{10, 20, 44, 20,444};
        System.out.println(LargestEle(arr));
    }
    
    static int LargestEle(int[] arr) {
        //Naive Solution
//        int lar=0;
//        for (int j : arr) {
//            boolean flag = true;
//            for (int k : arr) {
//                if (k > j) {
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag==true){
//                return j;
//            }
//
//        }
        
        //Optimize Solution
        
        int res = 0;
        for(int i = 1;i<arr.length;i++){
           if(arr[i]>arr[res]){
               res = i;
           }
           
        }
        return arr[res];
        
//        Arrays.sort(arr);
//        return arr[arr.length - 1];
    
    }
}
