package HashQuestions;
import java.util.*;
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int[] arr = new int[4];
        for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(isSumEqual(arr,sum));
    
    }
      static boolean isSumEqual(int[] arr,int sum){
        HashSet<Integer> h = new HashSet<>();
        int pre_fix = 0;
        for(int i =0;i<arr.length;i++){
            pre_fix+=arr[i];
            if(pre_fix==sum){
                return true;
            }
            if(h.contains(pre_fix-sum)){
                return true;
            }
            h.add(pre_fix);
        }
        return false;
      }
//    static boolean isSumEqual(int[]arr,int sum){
//        for(int i = 0;i<arr.length;i++){
//            int temp = 0;
//            for(int j = i;j<arr.length;j++){
//                temp+=arr[j];
//                if(temp==sum){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
