package Recursion;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        int c = 0;
        callFun(c);
    }
    
    public static void callFun(int c){
        if(c==3){
            return;
        }
        System.out.println(c);
        c++;
        callFun(c);
    }
}
