package Strings;
import java.util.*;
public class SubSeq {
    public static void main(String[] args) {
    String str = "ABCDEF";
    String strD = "ADE";
    int n = str.length();
    int m = strD.length();
        System.out.println(checkSub(str,strD,n,m));
 
    }
    
//    public static boolean checkSub(String str,String strD) {
//       int j = 0;
//        for (int i = 0; i < str.length() && j < strD.length() ; i++) {
//        if(str.charAt(i)== strD.charAt(j)){
//            j++;
//        }
//
//        }
//        return j==strD.length();
//
//    }
    
    
    public static boolean checkSub(String str,String strD,int n,int m) {
    if(n==0){
        return true;
    }
    if(m==0){
        return false;
    }
    if(str.charAt(n-1)==strD.charAt(m-1)){
        return checkSub(str,strD,n-1,m-1);
    } else{
        return checkSub(str,strD,n-1,m);
    }
        
    }
}
