package Recursion;
import java.util.*;
public class PrintSubSeq {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
    arr.add(3);
    arr.add(1);
    arr.add(2);
        int i = 0;
        ArrayList<Integer> seqArr = new ArrayList<>();
        printSub(i,arr,seqArr);
        
    }
    
    public static void printSub(int i,ArrayList<Integer> arr,ArrayList<Integer> seqArr){
        
        if(i==arr.size()){
            System.out.println(seqArr);
            return;
        }
        seqArr.add(arr.get(i));
        printSub(i+1,arr,seqArr); // TAKE THE ELEMENT
        seqArr.remove(arr.get(i));
        printSub(i+1,arr,seqArr); // NOT TAKE THE ELEMENT
    }
}
