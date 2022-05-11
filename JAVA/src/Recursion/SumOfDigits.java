package Recursion;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int sumNum = inputNumber.nextInt();
        System.out.println(sumF(sumNum));
    }
    static int sumF(int n){
        if(n==0)
            return 0;
        if(n<=1)
            return 1;
        return  n%10+sumF(n/10);
    }
}
