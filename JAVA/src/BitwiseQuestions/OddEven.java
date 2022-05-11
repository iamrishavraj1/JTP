package BitwiseQuestions;
import java.util.*;
public class OddEven {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int takeNumber = inputNumber.nextInt();
        isOddOrEven(takeNumber);
    }
    
    static void isOddOrEven(int n){
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("ODD");
        }
    }
}
