package Arrays.Questions;
import java.util.*;
public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = new int[] {100,180,260,310,40,535,695};
        int n = arr.length;
        System.out.println(stock(arr,n));
    }
    
//    public static int stock(int[]arr,int n){
//        int[] arr1 = new int[2];
//        int max = 0;
//        int res = 0;
//
//        for (int i = 0; i < n-1 ; i++) {
//            int buyStock = arr[i];
//            for (int j = i; j < n ; j++) {
//                int sellStock = arr[j];
//                if(sellStock>buyStock){
//                  max = sellStock-buyStock;
//
//                  if(max>res){
//                      res = max;
//                  }
//                }
//
//            }
//
//        }
//        return res ;
//    }
    
    public static int stock(int[] arr, int n){
        int maxPro = 0;
        int minPro = arr[0];
        for (int i = 0; i < n; i++) {
            minPro = Math.min(minPro,arr[i]);
            int profit = arr[i]-minPro;
            maxPro = Math.max(maxPro,profit);
        }
        return maxPro;
    }
}
