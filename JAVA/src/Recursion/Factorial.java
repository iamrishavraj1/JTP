package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int numberOfFact = inputNumber.nextInt();
        System.out.println(findFactorial(numberOfFact));
    }
    static int findFactorial(int n){
        if(n==0)
            return 1;
        return n* findFactorial(n-1);
    }
    
}
