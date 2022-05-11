package BitwiseQuestions;
import java.util.*;
public class Findithbit {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int numberFor = inputNumber.nextInt();
        int position = inputNumber.nextInt();
        ithBit(numberFor,position);
    }
    
    static void ithBit(int n, int i){
        if((n & (1 << i)) != 0){
            System.out.println("Set");
        } else{
            System.out.println("Not Set");
        }
    }
}
