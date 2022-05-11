package MathsQuestions;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int absoluteNumber = inputNumber.nextInt();
        System.out.println(findAbsoluteNumber(absoluteNumber));
    }
    
    static int findAbsoluteNumber(int n){
        if(n<0)
            return n*=(-1);
        return n;
    }
}
