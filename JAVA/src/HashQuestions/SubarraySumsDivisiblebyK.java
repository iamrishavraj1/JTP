package HashQuestions;
import java.util.*;
public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int[] arr = new int[6];
        for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(findSub(arr,sum));
    }
    
    public static int findSub(int[]arr,int k){
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int count = 0;
        int runningSum = 0;
        for(int i = 0;i<arr.length;i++){
            runningSum+=arr[i];
            int remainder = runningSum%k;
            if(remainder<0){
                remainder+=k;
            }
            if(m.containsKey(remainder)){
                count+=m.get(remainder);
            } else{
                m.put(remainder,m.getOrDefault(remainder,0)+1);
            }
         
            
        }
    
        return count;
        
    }
}
