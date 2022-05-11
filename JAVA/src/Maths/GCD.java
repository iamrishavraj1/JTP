package Maths;

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int gcdNumberOne = inputNumber.nextInt();
        int gcdNumberTwo = inputNumber.nextInt();
        System.out.println(findGcd(gcdNumberOne, gcdNumberTwo));
    }
    
    static int findGcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 & b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }
}
