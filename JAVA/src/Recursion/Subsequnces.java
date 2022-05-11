package Recursion;
import java.util.*;
public class Subsequnces {
    public static void main(String[] args) {
        ArrayList<Integer> sets  = new ArrayList<Integer>();
        sets.add(3);
        sets.add(1);
        sets.add(2);
        ArrayList<Integer> allSub  = new ArrayList<Integer>();
        findSubsequnces(0,allSub,sets);
    }
    static void findSubsequnces(int i , ArrayList<Integer> allSub,ArrayList<Integer> sets){
        if(i== sets.size()){
            System.out.println(allSub);
            return;
        }
        allSub.add(sets.get(i));
        findSubsequnces(i+1,allSub,sets);
        allSub.remove(sets.get(i));
        findSubsequnces(i+1,allSub,sets);
        
    }

}
