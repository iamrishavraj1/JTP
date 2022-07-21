package Recursion;
import java.util.*;
public class PrintLinearlyOneToN {
    public static void main(String[] args) {
        int n = 6;
        int i =1;
        oneton(n,i);
    }


    public static void oneton(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i);
        oneton(n,i+1);
    }
}
