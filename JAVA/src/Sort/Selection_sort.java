package Sort;
import java.util.*;

public class Selection_sort {
    public static void main(String[] args){
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int[] tempArr = new int[10];
        for(int i = 0;i<=arr.length;i++){
            int min_ind = i;
            for(int j=0;j<=arr.length-1;j++){
                if(arr[j]<min_ind){
                    min_ind=j;
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] =arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
            tempArr[i] = arr[min_ind];
        }
    }
}
