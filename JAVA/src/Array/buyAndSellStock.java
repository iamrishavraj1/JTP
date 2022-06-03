package Array;
import java.util.*;
public class buyAndSellStock {
    //121. Best Time to Buy and Sell Stock
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(findStock(arr));
    }
    public static int findStock(int[] arr){
        int maxProfit = 0;
        int minProfit = arr[0];
        for(int i = 0;i<arr.length;i++){
            minProfit = Math.min(minProfit,arr[i]);
            int profit = arr[i] - minProfit;
            maxProfit = Math.max(profit,maxProfit);
        }
        
        return maxProfit;
    }
}
