package Maths;
import java.util.*;
public class Palindrone {
    public static void main(String[] args){
    Scanner inputNumber = new Scanner(System.in);
    int findNumber = inputNumber.nextInt();
        System.out.println(isPalindrone(findNumber));
    }
    
    static boolean isPalindrone(int palindroneNumber){
        int reverse=0;
        int temp = palindroneNumber;
        while(temp!=0){
            int lastDigit = temp%10;
            reverse = reverse*10+lastDigit;
            temp=temp/10;
        }
       
        return (reverse==palindroneNumber);
    }
}
