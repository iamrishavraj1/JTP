package Sorting;
import java.util.*;


public class Checkiftwoarraysareequalornot {
    public static void main(String[] args) {
        int[] A = new int[]{ 2,2 };
        int[] B = new int[]{ 3,3 };
        int n = 2;
    
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        
        System.out.println( checkE(A,B,n));
       
    }
    
//    public static void sortA(int[]arr){
//        for (int i = 0; i < arr.length-1 ; i++) {
//            boolean flag = false;
//            for (int j = 0; j < arr.length-1 ; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    flag = true;
//
//                }
//            }
//            if(flag==false){
//                break;
//            }
//        }
//
//    }
    
    
    
//    public static void sortB(int[]arr){
//        for (int i = 0; i < arr.length-1 ; i++) {
//            boolean flag = false;
//            for (int j = 0; j < arr.length-1 ; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    flag = true;
//
//                }
//            }
//            if(flag==false){
//                break;
//            }
//        }
//
//    }
    
    
    public static boolean checkE(int[] A,int[] B,int n){
        int aL = A.length;
        int bL = B.length;
        if(aL!=bL){
            return false;
        }
        int count = 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <aL ; i++) {
            if(map.get(A[i])==null){
                map.put(A[i],1);
            } else{
                count = map.get(A[i]);
                count++;
                map.put(A[i],count);
            }
        }
    
        for (int i = 0; i <aL ; i++) {
            if(!map.containsKey(B[i])){
                return false;
            }
            if(map.get(B[i])==0){
                return false;
            }
            
            count = map.get(B[i]);
            --count;
            map.put(B[i],count);
        }
        return true;
    }
}
