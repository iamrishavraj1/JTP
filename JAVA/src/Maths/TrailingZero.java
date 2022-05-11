package Maths;
import java.util.*;

public class TrailingZero {
public static void main(String[] args){
Scanner inputNumber = new Scanner(System.in);
int factorialNumber = inputNumber.nextInt();
System.out.println(countZero(factorialNumber));
}

static int countZero(int n){
//    int res = 1;
//    for(int i = 2;i<=n;i++){
//        res*=i;
//    }
//    int last = 0;
//    while(res%10==0){
//    last++;
//    res/=10;
//    }
//
//    return last;
    //EFFICIENT MODE
    int res = 0;
    for(int i = 5;i<=n;i*=5){
        res+=n/i;
    }
    return res;
}



}
