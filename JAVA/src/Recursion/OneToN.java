package Recursion;
import java.util.*;
public class OneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();
        printOneToN(i,n);
    }
    
    static void printOneToN(int i,int n){
        if(i>n)
            return;
        System.out.println(i);
        printOneToN(i+1,n);
    }
}
