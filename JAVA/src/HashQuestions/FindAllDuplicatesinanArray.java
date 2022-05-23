package HashQuestions;
import java.util.*;
public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
    
    }
    
    public static int findD(int[]arr){
//        HashSet<Integer> s = new HashSet<>();
//        List<Integer> l = new ArrayList<>();
//        for(int i =0;i<arr.length;i++){
//            if(!s.contains(arr[i])){
//                l.add(arr[i]);
//            } else{
//                s.add(arr[i]);
//            }
//        }
//        return l;
    
        List<Integer> ls = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int index = Math.abs(arr[i]-1);
            if(arr[index]<0){
                ls.add(Math.abs(arr[i]));
            }
            arr[index]=-arr[index];
        }
        return ls;
    }
}
