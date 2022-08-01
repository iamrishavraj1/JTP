package Pratice.Arrays;
import java.util.*;
public class MaxAreaOfHistrogram {
    public static void main(String[] args) {
        int[] height = new int[]{2,1,5,6,2,3};
        System.out.println(findH(height));
       
    }
    static int findH(int[] heights){
//        int area=0;
//        for (int i = 0; i < height.length; i++) {
//            int left=i;
//            int right=i;
//            while(height[left]>height[i]){
//                left--;
//            }
//            while(height[right]>height[i]) {
//                right++;
//            }
//            area =Math.abs((right-left-1)*height[i]);
//
//        }
//        return area;
        int maxarea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                int minheight = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++)
                    minheight = Math.min(minheight, heights[k]);
                maxarea = Math.max(maxarea, minheight * (j - i + 1));
            }
        }
        return maxarea;
    }
}
