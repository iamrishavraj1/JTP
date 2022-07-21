package Recursion;
import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(6);
        arr.add(7);
        int target = 7;
        int i = 0;
        ArrayList<Integer> newArr = new ArrayList<>();
        comb(arr,newArr,target,i);
    }
    public static void comb(ArrayList<Integer> arr,ArrayList<Integer> newArr,int target,int i){
        if(i==arr.size()){
            if(target==0){
                System.out.println(newArr);
            }
            return;
        }
        
        if(arr.get(i)<=target){
            newArr.add(arr.get(i));
            comb(arr,newArr,target-arr.get(i),i);
            newArr.remove(arr.get(i));
        }
        comb(arr,newArr,target,i+1);
    }
}
