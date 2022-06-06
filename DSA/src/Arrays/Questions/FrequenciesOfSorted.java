package Arrays.Questions;
import java.util.*;
public class FrequenciesOfSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{7,10,4,10,6,5,5};
        int n = arr.length;
       freqSort(arr,n);

    }
    
    public static void freqSort(int[] arr,int n){
      int count = 1;
      int i = 1;
      while(i<n) {
          while (i < n && arr[i] == arr[i - 1]) {
              count++;
              i++;
          }
          System.out.println(arr[i - 1] + " " + count);
          i++;
          count = 1;
      }
        if(n==1||arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+1);
        }
    }
    
}
