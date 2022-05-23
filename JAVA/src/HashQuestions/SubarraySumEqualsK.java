package HashQuestions;
import java.util.*;
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int[] arr = new int[3];
        for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(findSub(arr,sum));
    }
    
    public static int findSub(int[] arr,int k){
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int sum = 0;
        int pre_fix = 0;
        for(int i = 0;i<arr.length;i++){
            pre_fix+=arr[i];
            if(m.containsKey(pre_fix-k)){
                sum+=m.get(pre_fix-k);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return sum;
    }
}
