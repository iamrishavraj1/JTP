package Arrays.Questions;
import java.util.*;
public class IndexOfSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{5,8,20,10};
        System.out.println(findSecIndexEffSol(arr));
    
    }
    
    public static int findSecIndexEffSol(int[] arr){
    int largest = findLarIndex(arr);
    int secondLar = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[largest]){
                if(secondLar==-1){
                    secondLar=i;
                } else if(arr[i]>arr[secondLar]){
                    secondLar = i;
                }
            }
        }
        return secondLar;
    }
    
    public static int findLarIndex(int[] arr){
        int largest = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
}
