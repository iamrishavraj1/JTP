package Recursion;
import java.util.*;
public class SubSeqSumK {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int k = 5;
        int i = 0;
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<>();
        printSub(i,arr,newArr,k,sum);
    }
    
    public static void printSub(int i,ArrayList<Integer> arr, ArrayList<Integer> newArr,int k,int sum){
        if(i==arr.size()){
            if(sum==k){
                System.out.println(newArr);
               
            }
            return;
        }
        
        newArr.add(arr.get(i));
        sum+=arr.get(i);
        printSub(i+1,arr,newArr,k,sum);
        newArr.remove(arr.get(i));
        
        sum-=arr.get(i);
        printSub(i+1,arr,newArr,k,sum);
        
       
    }
}
