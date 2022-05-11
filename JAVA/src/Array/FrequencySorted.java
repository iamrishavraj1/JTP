package Array;
import java.util.*;


public class FrequencySorted {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1,2,2,2,3,3,3,3,4,4,4};
        countSort(arr);
    }
    static void countSort(int[] arr){
        int count = 1;
        int i=1;
       
        while(i < arr.length){
            while(i<arr.length && arr[i]==arr[i-1]){
                count++;
                i++;
            }
            System.out.println(arr[i-1]+" "+count);
            i++;
            count = 1;
        }

        if(arr.length == 1 || arr[i]!=arr[i-1]){
            System.out.println(arr[i-1]+ " " + count);
        }
        
    }
}
