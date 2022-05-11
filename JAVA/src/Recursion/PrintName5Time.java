package Recursion;
import java.util.*;
public class PrintName5Time {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 0;
        PrintName(n);
    }

    static void PrintName(int n){
         if(n==5)
             return;
        System.out.println("Name");
        n++;
        PrintName(n);
    }
}
