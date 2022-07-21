package Strings;
import java.util.*;
public class PalidroneCheck {
    public static void main(String[] args) {
        String str = "ABBA";
        System.out.println( checkPali(str));
        
    }
    
    public static boolean checkPali(String str){
       int low =0;
       int high = str.length()-1;
       while(low<high){
           if(str.charAt(low)!=str.charAt(high)){
               return false;
           }
           low++;
           high--;
       }
       return true;
    }
    
//    public static boolean checkPali(String str){
//        StringBuilder revStr = new StringBuilder(str);
//        revStr.reverse();
//       return str.equals(revStr.toString());
//    }
}
