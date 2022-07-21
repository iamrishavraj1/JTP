package Strings;
import java.util.*;
public class CheckPanagram {
    public static void main(String[] args) {
    String str = "listen";
    String strP = "silent";
        System.out.println(    checkPan(str,strP));

    }
    static final int CHAR = 256;
    public static boolean checkPan(String str,String strP){
        
        
        if(str.length()!=strP.length()){
            return false;
        }
        int count[] = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            count[strP.charAt(i)]--;
        }
        for (int i = 0; i <CHAR ; i++) {
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    
    
//    public static boolean checkPan(String str,String strP){
//      
//      
//      if(str.length()!=strP.length()){
//          return false;
//      }
//      char arr[] = str.toCharArray();
//      Arrays.sort(arr);
//      str = new String(arr);
//        char arrP[] = strP.toCharArray();
//        Arrays.sort(arrP);
//        strP = new String(arrP);
//      return str.equals(strP);
//    }
}
