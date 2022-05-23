package HashQuestions;
import java.util.*;
public class LargSubArraywithGivenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int[] arr = new int[3];
        for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(maxlen(arr,sum));
    }
    static int maxlen(int[] arr,int sum){
      Map<Integer,Integer> m = new HashMap<>();
        int pre_fix =0;
        int res = 0;
        for(int i =0;i<arr.length;i++){
        pre_fix+=arr[i];
        if(pre_fix==sum){
            return i+1;
        }
        if(m.containsKey(pre_fix)==false){
            m.put(pre_fix,i);
        }
        if(m.containsKey(pre_fix-sum)){
            res=Math.max(res,i-m.get(pre_fix-sum));
        }
        }
        return res;
    }
//    static int maxlen(int[] arr,int sum){
//        int res = 0;
//        for(int i = 0;i<arr.length;i++){
//            int curr = 0;
//            for(int j = i;j<arr.length;j++){
//                curr+=arr[j];
//                if(curr==sum){
//                    res = Math.max(0,j-i+1);
//                }
//            }
//        }
//        return res;
//    }
}
