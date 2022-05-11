package Bitwise;
import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int numberPower = inputNumber.nextInt();
        System.out.println(hasPower(numberPower));
        
    }
    //NAIVE SOLUTION
//    static boolean hasPower(int n){
//        if(n==0)
//            return false;
//        while(n!=1){
//            if(n%2!=0)
//                return false;
//            n/=2;
//        }
//        return true;
//    }
    
    
    //BRIAN KERNINGRAN SOLUTION
//    static boolean hasPower(int n){
//        if(n==0)
//            return false;
//        return ((n&(n-1))==0);
//    }
    
    //ONE LINE SOLUTION
    static boolean hasPower(int n){
        return (n!=0 && (n&(n-1))==0);
    }
}
