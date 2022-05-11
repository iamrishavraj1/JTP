package Maths;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int primeNumber = inputNumber.nextInt();
        System.out.println(isPrime(primeNumber));
    }
    
    //Native Solution
//    static boolean isPrime(int a) {
//        if (a == 1)
//            return false;
//        int i;
//        for (i = 2; i < a; i++) {
//            if (a % i == 0)
//                return false;
//
//        }
//        return true;
//    }
    
    
    
    //Efficient Solution
//    static boolean isPrime(int a) {
//        if (a == 1)
//            return false;
//        int i;
//        for (i = 2; i*i <= a; i++) {
//            if (a % i == 0)
//                return false;
//
//        }
//        return true;
//    }
    // More Efficient Solution
    static boolean isPrime(int a) {
        if (a == 1 )
            return false;
        if(a==2 || a==3)
            return true;
        if(a%2==0 || a%3==0)
            return false;
        int i;
        for (i = 5; i*i <= a; i+=6) {
            if ((a % i == 0) || a %(i+2)==0)
                return false;
            
        }
        return true;
    }
}
