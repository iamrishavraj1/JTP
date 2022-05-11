package Bitwise;
import java.util.*;
public class CountSetBit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bitNumber = input.nextInt();
        System.out.println(countSet(bitNumber));
    }
    //NAIVE SOLN
//  ?  static int countSet(int n){
//        int count = 0;
//        while(n>0){
//
//            //METHOD-1
////            if(n%2!=0){
////                count++;
////            }
//
//            //METHOD-2
////            if((n&1)==1){
////                count++;
////            }
//
//            //METHOD-3
//            count+=(n&1);
//
//
//            //WITH METHOD-1
////            n/=2;
//
//            //WITH METHOD-2 and 3
//            n>>=1;
//        }
//        return count;
//    }
//
    
    //BRIAN KERNINGAM'S ALOGORITHAM --> TS- O(NO OF SET BIT)
    static int countSet(int n){
        int count = 0;
        while(n>0){
          
          n=(n&(n-1));
          count++;
        }
        return count;
    }
    
    
    //LOOKUP TABLE METHOD FOR 32 BIT NUMBER ---> TS- O(1)
    //PENDING
}
