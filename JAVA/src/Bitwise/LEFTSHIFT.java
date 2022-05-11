package Bitwise;
import java.util.*;
public class LEFTSHIFT {
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        int mainNumber = inputNumber.nextInt();
        int shiftNumber = inputNumber.nextInt();
        System.out.println(mainNumber<<shiftNumber);
    }
}
