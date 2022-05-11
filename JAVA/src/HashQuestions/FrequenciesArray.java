package HashQuestions;
import java.util.*;
public class FrequenciesArray {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[] = new int[5];
    for (int i = 0;i<arr.length;i++){
        arr[i]= in.nextInt();
    }
    findFreq(arr);
    }
    // Naive Solution
//    static void findFreq(int arr[]){
//        for(int i =0;i<arr.length;i++){
//            boolean flag = false;
//            for(int j = 0;j<i;j++){
//                if(arr[i]==arr[j]){
//                    flag= true;
//                    break;
//                }
//            }
//            if(flag==true){
//                continue;
//            }
//            int count = 1;
//            for(int k = i+1;k<arr.length;k++){
//                if(arr[i]==arr[k]){
//                    count++;
//                }
//            }
//            System.out.println(arr[i] + " " + count);
//        }
//
//    }
    
    //Eff Solution.
    static void findFreq(int arr[]){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x:arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
