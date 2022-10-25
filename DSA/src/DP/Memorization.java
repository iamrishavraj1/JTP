package DP;
import java.util.*;

public class Memorization {
    static int[] memo;
    public static void main(String[] args) {
        int n = 3;
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(memo(n));

    }
    public static int memo(int n){
        if(memo[n]==-1){
            int res;
            if(n==0 || n==1){
                res=n;
            } else{
                res = memo(n-1)+memo(n-2);
            }
            memo[n] = res;
        }
        return memo[n];
    }
}
