package Arrays.Questions;
import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,5};
        int n = arr.length;
        System.out.println(findM(arr,n));
    }
    
    
    
    public static int findM(int[] arr,int n){
        int ans = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]-arr[j]>1){
                    ans = arr[i]+1;
                }
            }
            
        }
        return ans;
    }
}
