package HashQuestions;
import java.util.*;
public class LargSubArraywithGivenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 5;
        int[] arr = new int[]{5,2,3,4};
       
        System.out.println(maxlen(arr,sum));
    }
    static int maxlen(int[] arr,int sum) {
        Map<Integer,Integer> m = new HashMap<>();
       int prefix = 0;
       int res = 0;
       for(int i = 0;i< arr.length;i++){
           prefix+=arr[i];
           if(prefix==sum){
                res = i+1; // 1;
           }
           if(!m.containsKey(prefix)){
               m.put(prefix,i);
           }
           if(m.containsKey(prefix-sum)){
               res = Math.max(res,i-m.get(prefix-sum));
           }
       }
       return res;
    }
}
//    int res = 0;
//        for(int i = 0;i<arr.length;i++){
//        int count = 0;
//        for(int j = i;j<arr.length;j++){
//        count+=arr[j];
//        if(count==sum){
//        res = Math.max(res,j-i+1);
//        }
//        }
//        }
//        return res;
