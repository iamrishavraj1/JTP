package BitwiseQuestions;
import java.util.*;
public class FirstSetBitFromRight {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int bitNumber = inputNumber.nextInt();
        System.out.println(checkPosition(bitNumber));
    }
    
    static int checkPosition(int n){
        int count = 1;
        if(n==0){
            return 0;
        }
        while((n&1)!=1){
            count++;
            n/=2;
        }
        return count;
    }

}
