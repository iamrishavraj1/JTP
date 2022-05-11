package Recursion;
import java.util.*;
public class SubsetOne {
    public static void main(String[] args) {
        ArrayList<Integer> oldArr = new ArrayList<>();
        oldArr.add(2);
        oldArr.add(3);
        ArrayList<Integer> newArr = new ArrayList<>();
        int sum = 0;
        int index = 0;
        int size = oldArr.size();
        solution(oldArr,newArr,sum,index,size);
        Collections.sort(newArr);
        System.out.println(newArr);
    }
    
    static void solution(ArrayList<Integer> oldArr,ArrayList<Integer> newArr, int sum,int index,int size){
        if(index == size) {
            newArr.add(sum);
            return;
        }
        //PICK
        solution(oldArr, newArr,sum + oldArr.get(index),index+1,size);
        //NOT PICK
        solution(oldArr,newArr,sum,index+1,size);
    }
}
