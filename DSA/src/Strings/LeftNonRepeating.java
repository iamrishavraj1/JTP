package Strings;
import java.util.*;
public class LeftNonRepeating {
    public static void main(String[] args){
        String str = "geeksforgeeks";
        System.out.println(checkNon(str));
    }
    static final int CHAR = 256;
    public static int checkNon(String str){
    int[] arr = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(arr[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    
    
//    public static int checkNon(String str){
//        for (int i = 0; i < str.length() ; i++) {
//            boolean flag = false;
//            for (int j = 0; j <str.length() ; j++) {
//                if(i!=j && str.charAt(i)==str.charAt(j)){
//                   flag=true;
//                   break;
//                }
//            }
//            if (flag==false){
//                return i;
//            }
//
//        }
//        return -1;
    }
    
    
}
