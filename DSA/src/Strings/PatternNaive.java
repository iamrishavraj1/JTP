package Strings;
import java.util.*;
public class PatternNaive {
    public static void main(String[] args) {
    String one = "GEEKSFORGEEKS";
    String two = "EKS";
    checkPattern(one,two);
    
    }
    
    public static void checkPattern(String one,String two){
        int n = one.length();
        int m = two.length();
        for (int i = 0; i <= (n-m); i++) {
            int j;
            for(j=0;j<m;j++){
                if(two.charAt(j)!=one.charAt(i+j)){
                    break;
                }
               
            }
            if(j==m){
                System.out.print(i + " ");
            }
            
        }
    }
    
}
