package Recursion;
import java.util.*;
public class OnetoNusingBT {
    public static void main(String[] args) {
    int n = 1;
    int i = 6;
    onetonbt(n,i);
    }
    
    public static void onetonbt(int n,int i){
        if(i<n){
            return;
        }
        onetonbt(n,i-1);
        System.out.println(i);
    }
}
