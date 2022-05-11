package Bitwise;
import java.util.*;
public class KthBit {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int numberBit = inputNumber.nextInt();
        int numberPosition = inputNumber.nextInt();
        kthNumber(numberBit, numberPosition);
    }
    
    static void kthNumber(int n,int k){
      if((n & (1 << (k-1)))==1){
          System.out.println("YES");
      } else{
          System.out.println("NO");
      }
    }
}
