package Maths;
import java.util.Scanner;

import static java.lang.Math.*;

public class FindDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       long digitNumber = input.nextInt();
        System.out.println(countDigit(digitNumber));
    }
    
    //ITERATIVE SOLUTION
//    static int countDigit(long number){
//        int count = 0;
//        while(number!=0){
//          number=number/10;
//            ++count;
//        }
//        return count;
//    }
    
    
    //RECURSIVE SOLUTION
//    static int countDigit(long number){
//       if(number ==0)
//           return 0;
//       return 1+countDigit(number/10);
//    }
    
    //LOGARITHMIC SOLUTION
    static int countDigit(long number){
        return (int) floor(log10(number)+1);
    }
}
