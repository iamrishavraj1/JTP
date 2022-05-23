package HashQuestions;
import java.util.*;
public class LongestSubArraywithEqualsZeroandOne {
    public static void main(String[] args) {
    
    }
    
    static int longest(int[] arr){
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            int zero = 0;
            int one = 0;
            for(int j = i;j<arr.length;j++){
            if(arr[j]==0){
                zero++;
            } else{
                one++;
            }
            if(zero==one){
                res=Math.max(res,zero+one);
            }
            }
        }
        return res;
    }
}
