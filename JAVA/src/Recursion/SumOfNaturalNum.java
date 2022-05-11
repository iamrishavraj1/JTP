package Recursion;
import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int naturalNum = inputNumber.nextInt();
        System.out.println(sumF(naturalNum));
    }
    static int sumF(int n){
        if(n==0)
            return 0;
        return  n+sumF(n-1);
    }
}
