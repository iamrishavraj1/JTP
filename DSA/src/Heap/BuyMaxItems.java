package Heap;
import java.util.*;
public class BuyMaxItems {
    public static void main(String[] args) {
        //USING HEAP
        int[] arr = new int[]{1,12,5,111,200};
        int n = arr.length;
        int sum = 10;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0;i<n;i++){
            pq.add(arr[i]);
        }

        for(int j = 0;j<n;j++){
            if(pq.peek()<=sum){
                sum-=pq.poll();
                count++;
            } else{
                break;
            }
        }
        System.out.println(count);



        //USING SORTING
//        int[] arr = new int[]{1,12,5,111,200};
//        Arrays.sort(arr);
//        int n = arr.length;
//        int sum = 10;
//        int count = 0;
//        for(int i = 0;i<n;i++){
//            if(arr[i]<sum){
//                sum-=arr[i];
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
