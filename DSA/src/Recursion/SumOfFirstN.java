package Recursion;
import java.util.*;
public class SumOfFirstN {
    public static void main(String[] args) {
        int n = 3;
//        int i = 1;
//        int sum = 0;
        System.out.println(sumofn(n));
    }
    
    public static int sumofn(int n){
      if(n==0){
          return 0;
      } else {
          return n + sumofn(n-1);
      }
    }
    
//    public static void sumofn(int n,int i,int sum){
//        if(i>n){
//            System.out.println(sum);
//            return;
//        };
//
//        sumofn(n,i+1,sum+i);
//
//    }
}
