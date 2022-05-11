package Maths;
import java.util.*;
public class PrimeFactors {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int primeNumber = inputNumber.nextInt();
        findPrimeFactors(primeNumber);
    }
    static boolean isPrime(int p){
        if(p==1)
            return false;
        if(p==2 || p==3)
            return true;
        if(p%2==0 || p%3==0)
            return false;
        for(int i = 5; i*i<=p;i+=6 ){
            if((p%i==0) || p%(i+2)==0 )
                return false;
        }
        return true;
    }
    static void findPrimeFactors(int a) {
        for (int i = 2; i < a; i++) {
            if (isPrime(i)) {
                int x = i;
                while (a % x == 0) {
                    System.out.println(i);
                    x*=i;
                }
            }
            
        }
    
    
       
    }
}
