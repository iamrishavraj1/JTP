package Recursion;
import java.util.*;
public class NtoOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printNToOne(n);
    }
    
    static void printNToOne(int n){
        if(n<1)
            return;
        System.out.println(n);
        printNToOne(n-1);

    }
}
