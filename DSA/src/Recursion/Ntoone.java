package Recursion;
import java.util.*;
public class Ntoone {
    public static void main(String[] args) {
    int n = 1;
    int i =6;
    ntoone(n,i);
    }
    
    public static void ntoone(int n,int i){
        if(i<n){
            return;
        }
    
        System.out.println(i);
        ntoone(n,i-1);
    }
}
