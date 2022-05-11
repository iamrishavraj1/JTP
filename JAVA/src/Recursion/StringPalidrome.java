package Recursion;
import java.util.*;
public class StringPalidrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int start = 0;
        int end = str.length()-1;
        System.out.println(isPalidroneTwo(str,start));
        
    }
    
//    static boolean isPalidrome(String str, int start,int end){
//        if(start >=end)
//            return true;
//
//        return (str.charAt(start)==str.charAt(end) && isPalidrome(str,start+1 , end-1));
//
//    }
    
    static boolean isPalidroneTwo(String str, int start){
        if(start>=str.length()/2) return true;
        if(str.charAt(start)!=str.charAt(str.length()-start-1)) return false;
        return isPalidroneTwo(str,start+1);
        
    }
}

//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
