package Maths;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int factorialNumber = inputNumber.nextInt();
        System.out.println(ofFactorial(factorialNumber));
    }
    
    //ITERATIVE SOLUTION
//    static int ofFactorial(int n) {
//        int i;
//        int res = 1;
//        for (i = 2; i <= n; i++) {
//            res *= i;
//        }
//        return res;
//    }
    
    static int ofFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*ofFactorial(n-1);
    }
    
}
//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
