package Strings;
import java.util.*;
public class PatternNaiveForDist {
    public static void main(String[] args) {
        String one = "ABCEABEFABCD";
        String two = "ABCD";
        checkPattern(one,two);
        
    }
    
    public static void checkPattern(String one,String two){
        int n = one.length();
        int m = two.length();
        for (int i = 0; i <=n-m ;) {
            int j;
            for(j = 0;j<m;j++){
                if(two.charAt(j)!=one.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                System.out.println(i + " ");
            }
            if(j==0){
                i++;
            }
            else{
                i=(i+j);
            }
            
        }
    }
}
