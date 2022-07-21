package Strings;
import java.util.*;
public class PrintFreqChar {
    public static void main(String[] args) {
        String str = "hello";
        int[] count = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            count[str.charAt(i)-'a']++;
            
        }
        for (int i = 0; i <str.length() ; i++) {
            if(count[str.charAt(i)-'a']!=0){
                System.out.println(str.charAt(i) + " " + count[str.charAt(i)-'a']);
                count[str.charAt(i)-'a']=0;
            }
        
        }
    }
}
