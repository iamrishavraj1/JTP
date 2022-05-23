package HashQuestions;
import java.util.*;
public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(isSumZero(arr));
    }
    static  boolean isSumZero(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        int pre_fix = 0;
        for(int i = 0;i<arr.length;i++){
            pre_fix+=arr[i];
            if(h.contains(pre_fix)){
                return true;
            }
            if(pre_fix==0){
                return true;
            }
            h.add(pre_fix);
        }
        return false;
    }
//    static boolean isSumZero(int[] arr){
//        for(int i = 0;i<arr.length;i++){
//            int sum = 0;
//            for(int j = i;j< arr.length;j++){
//                sum+=arr[j];
//                if(sum==0){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
