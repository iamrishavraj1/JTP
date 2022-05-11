package HashQuestions;
import java.util.*;
public class Dist_Elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(findDist(arr));
    }
    //Naive Soln using noraml array
//    static int findDist(int arr[]){
//        int count = 0;
//        for(int i = 0;i<arr.length;i++){
//            boolean flag = false;
//            for(int j = 0;j<i;j++){
//                if(arr[i]==arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag==false){
//                count++;
//            }
//        }
//        return count;
//    }
    
    //Using hashset Efficient Method
//    static int findDist(int arr[]){
//        HashSet<Integer> newSet = new HashSet<Integer>();
//        for(int i = 0;i<arr.length;i++){
//            newSet.add(arr[i]);
//        }
//        return newSet.size();
//    }
    //Covert array to list
    static int findDist(Integer arr[]){
        HashSet<Integer> newSet = new HashSet<>(Arrays.asList(arr));
        return newSet.size();
    }
}
