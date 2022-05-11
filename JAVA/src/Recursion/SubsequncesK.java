package Recursion;
import java.util.*;


public class SubsequncesK {
    public static void main(String[] args) {
        ArrayList<Integer> oldArr = new ArrayList<Integer>();
        oldArr.add(1);
        oldArr.add(2);
        oldArr.add(1);
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int findK = 2;
        int index = 0;
        int sum = 0;
        findK(oldArr, newArr, findK, index, sum);
    
    }
    
    
    
    static void findK(ArrayList<Integer> oldArr,ArrayList<Integer> newArr,int findK, int index,int sum){
        if(index==oldArr.size()){
            if(sum==findK){
                System.out.println(newArr);
            }
            return;
        }
        
        
        //TAKE
        newArr.add(oldArr.get(index));
        sum = sum + oldArr.get(index);
        findK(oldArr, newArr, findK, index+1, sum);
//        newArr.remove(newArr.size()-1); // DOUBTS
        newArr.remove(oldArr.get(index));
        
        
        //NOT TAKE
        sum = sum-oldArr.get(index);
        findK(oldArr, newArr, findK, index+1, sum);
        
    }
}
