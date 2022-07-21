package Recursion;
import java.util.*;
public class PrintName {
    public static void main(String[] args) {
        int n = 6;
        namePrint(1,n);
    }
    
    public static void namePrint(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Rishav");
        namePrint(i+1,n);
    }
}
