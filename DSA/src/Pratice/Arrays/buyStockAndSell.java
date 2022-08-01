package Pratice.Arrays;
import java.util.*;
public class buyStockAndSell {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
    
        System.out.println(maxProfit(prices));
    }
    
    static int maxProfit(int[] prices){
        int buy = prices[0];
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buy){
                buy = prices[i];
            } else if((prices[i]-buy)>max_profit){
                max_profit = prices[i]-buy;
            }
        }
        return max_profit;
    }
}
