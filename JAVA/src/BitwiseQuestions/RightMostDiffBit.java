package BitwiseQuestions;
import java.util.*;
public class RightMostDiffBit {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int firstNum = inputNumber.nextInt();
        int secondNum = inputNumber.nextInt();
        System.out.println(checkPosition(firstNum,secondNum));
    }
    
    static int checkPosition(int n , int m){
        int count = 1;
        int xorNM = n ^ m;
        while((xorNM&1)!=1){
            xorNM>>=1;
            count++;
        }
        return count;
    }
}
