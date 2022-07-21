package Recursion;
import java.util.*;
public class CheckPalidrome {
    public static void main(String[] args) {
    String name = "madam";
    int n = name.length();
    int i = 0;
        System.out.println( checkPali(name,i,n));
    }
    
    public static boolean checkPali(String name,int i,int n){
        if(i>=n/2){
            return true;
        }
        if(name.charAt(i)!=name.charAt(n-i-1)) {
            return false;
        } else {
            return checkPali(name,i+1,n);
        }
    }
}
