package Recursion;
import java.util.*;
public class NtoOneUsingBT {
    public static void main(String[] args) {
    int n = 6;
    int i =1;
    ntoonebt(n,i);
    }
    
    public static void ntoonebt(int n,int i){
        if(i>n){
            return;
        }
        
        ntoonebt(n,i+1);
        System.out.println(i);
    }
}
