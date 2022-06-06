package Arrays.Questions;
import java.util.*;
public class IndexOfLargestElement {
    public static void main(String[] args) {
    int[] arr = new int[]{5,8,20,10};
//        System.out.println(findIndex(arr));
        System.out.println(findIndexEffSol(arr));
    }
    //NAIVE
    public static int findIndex(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        Boolean flag = true;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>arr[i]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            return i;
        }
        }
        return -1;
    }
    //EFFICIENT
    public static int findIndexEffSol(int[] arr){
        int res = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
    }
}
