package Arrays.Questions;
import java.util.*;
public class FIndAndMissing {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,5};
        int n = arr.length;
    
        System.out.println(findMandR(arr,n));

       
    }
    public static int[] findMandR(int[] arr,int n){
        int[] arrN = new int[n+1];
        int[] ans = new int[2];
        int miss = 0;
        int repeat = 0;
        for (int i = 0; i <n ; i++) {
          if(arrN[arr[i]-1]==0){
              arrN[arr[i]-1]=1;
          }
          if(arrN[arr[i]-1]==1){
         repeat = arr[i];
         ans[0] = repeat;
          }
        }
    
        for (int i = 0; i <n ; i++) {
            if(arrN[i]==0){
        miss = i+1;
        ans[1] = miss;
            }
        }
     return ans;
    }
}
