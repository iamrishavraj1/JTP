package Pratice.String;
import java.util.*;
public class LongestPrefixString {
    public static void main(String[] args) {
        String[] a = new String[]{"flower","flow","flight"};
        int n = a.length;
        System.out.println(longestCommon(a,n));
    }
    static String longestCommon(String[] a,int n){
        Arrays.sort(a);
        if (n == 0)
            return "NO";
    
        if (n == 1)
            return a[0];
    
        int end = Math.min(a[0].length(),a[n-1].length());
        int i = 0;
        while(i<end && a[0].charAt(i)==a[n-1].charAt(i)){
            i++;
        }
        String ans = a[0].substring(0,i);
        return ans;
    }
}
