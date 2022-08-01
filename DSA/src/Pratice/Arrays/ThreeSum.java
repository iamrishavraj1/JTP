package Pratice.Arrays;
import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        System.out.println(findSum(arr));
        
    }
    
    static List<List<Integer>> findSum(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length ; k++) {
                    if(arr[i]+arr[j]+arr[k]==0 && !ans.contains(Arrays.asList(new Integer[]{arr[i],arr[j],arr[k]}))){
                        ans.add(Arrays.asList(new Integer[]{arr[i],arr[j],arr[k]}));
                    }
                }
            }
        }
        return ans;
    }
    
}
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> s = new HashSet<>();
//        if(nums.length==0) return new ArrayList<>(s);
//        Arrays.sort(nums);
//        for(int i = 0;i<nums.length-2;i++){
//            int j = i+1;
//            int k = nums.length-1;
//            while(j<k){
//                int sum = nums[j]+nums[k];
//                if(sum==-nums[i]){
//                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                    j++;k--;
//                }
//                else if(sum>-nums[i])k--;
//                else if(sum<-nums[i])j++;
//            }
//        }
//
//        return new ArrayList<>(s);
//    }
