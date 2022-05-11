package Recursion;
import java.util.*;
public class Fibonaci {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int fibNum = inputNumber.nextInt();
        int ans = findFibbonaci(fibNum);
        System.out.println(ans);
    }
    
    static int findFibbonaci(int n){
       if(n<2){
           return n;
       }
       return findFibbonaci(n-1) + findFibbonaci(n-2);
    
    }
}
