//package Recursion;
//import java.sql.Array;
//import java.util.*;
//public class Permutation {
//    public static void main(String[] args){
//    ArrayList<Integer> oldArr = new ArrayList<Integer>();
//    oldArr.add(1);
//    oldArr.add(2);
//    oldArr.add(3);
//    ArrayList<Integer> newArr = new ArrayList<Integer>();
//    ArrayList<Integer> ans = new ArrayList<Integer>();
//    boolean[] checkIndex = new boolean[oldArr.size()];
//    int oldArrSize = oldArr.size();
//    int newArrSize = newArr.size();
//        System.out.println(Solution(oldArr,newArr,ans,checkIndex,oldArrSize,newArrSize));
//    }
//
//    static void Solution(ArrayList<Integer> oldArr, ArrayList<Integer> newArr, ArrayList<Integer> ans, boolean[] checkIndex,int oldArrSize, int newArrSize){
//        if(oldArrSize==newArrSize){
//            ans.add(new ArrayList<>(newArr));
//            return;
//        }
//        for(int i = 0;i<oldArrSize;i++){
//            if(!checkIndex[i]){
//            checkIndex[i] = true;
//            newArr.add(oldArr.get(i));
//            Solution(oldArr, newArr, ans, checkIndex, oldArrSize, newArrSize);
//            newArr.remove(newArrSize-1);
//            checkIndex[i] = false;
//
//            }
//        }
//    }
//}
