package Recursion;
import java.util.*;
public class FibbNu {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findFibb(n));
    }
    
    public static int findFibb(int n){
        if(n<=1){
            return n;
        }
        return findFibb(n-1)+findFibb(n-2);
    }
}
