package Array;
import java.util.*;
public class SearchingArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int element = 10;
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Array is :" + " " + Arrays.toString(arr));
        
        for(int j = 0;j<arr.length;j++){
            if(arr[j]==element){
                System.out.println(arr[j]);
            }
        }
      
    }
}
