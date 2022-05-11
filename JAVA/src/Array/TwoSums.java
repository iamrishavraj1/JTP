package Array;
import java.util.*;
public class TwoSums {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{3,2,3};
       int target = 6;
       int[] a=new int[2];
        System.out.println(Arrays.toString(twoSum(arr,target,a)));
       
    }
  static int[] twoSum(int[] nums, int target,int[] a) {
      int i;
      int j=0;
      for(i=0;i<nums.length-1;i++){
        
          if(nums[i]+nums[j]==target){
              a[0] = i;
              a[1] = j;
              break;
          }
          else{
              j++;
          
          }
      }
      return a;

  }
}
