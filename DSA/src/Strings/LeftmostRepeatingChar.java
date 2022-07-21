package Strings;
import java.util.*;
public class LeftmostRepeatingChar {
    public static void main(String[] args) {
    String str = "abbad";
        System.out.println(  checkLeft(str));
    }
  static final int CHAR = 256;
    
    public static int checkLeft(String str){
        int[] arr = new int[CHAR];
        Arrays.fill(arr,-1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <str.length() ; i++) {
            int fi = arr[str.charAt(i)];
            if(fi ==-1){
                arr[str.charAt(i)]=i;
            } else{
                res = Math.min(res,fi);
            }
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
//    public static int checkLeft(String str){
//   int[] arr = new int[CHAR];
//        for (int i = 0; i < str.length() ; i++) {
//            arr[str.charAt(i)]++;
//        }
//
//        for (int i = 0; i <str.length() ; i++) {
//            if(arr[str.charAt(i)]>1){
//                return i;
//            }
//        }
//        return -1;
//    }
    
//    public static int checkLeft(String str){
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i+1; j < str.length(); j++) {
//            if (str.charAt(i)==str.charAt(j)){
//                return i;
//            }
//            }
//        }
//
//        return -1;
//    }
}
