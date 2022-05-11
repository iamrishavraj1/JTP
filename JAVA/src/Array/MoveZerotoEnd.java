package Array;
import java.util.*;
public class MoveZerotoEnd {
    public static void main(String[] args){
        int[] arr;
        arr = new int[]{0,0,0,0,0,0,0,9,0,8,0,8,5,0,0,3};
        endZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void endZero(int[] arr){
        int high = arr.length-1;
        int low = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count]=temp;
                count++;
            }
        }
//       while(high>low){
//           if(arr[high]!=0&& arr[low]==0){
//           arr[low] = arr[high];
//           arr[high] = 0;
//           high--;
//           low++;
//           }
//           else if(arr[high]==0){
//               high--;
//
//           } else if(arr[low]!= 0){
//               low++;
//           }
//       }
//       for(int i = 0;i<arr.length;i++){
//           if(arr[i]==0){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[j]!=0){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//           }
    
    }
}
