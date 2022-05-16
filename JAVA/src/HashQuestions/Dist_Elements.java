package HashQuestions;
import java.util.*;
public class Dist_Elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(findDist(arr));
    }
    //Naive Soln using noraml array
//    static int findDist(int arr[]){
//        int count = 0;
//        for(int i = 0;i<arr.length;i++){
//            boolean flag = false;
//            for(int j = 0;j<i;j++){
//                if(arr[i]==arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag==false){
//                count++;
//            }
//        }
//        return count;
//    }
    
    //Using hashset Efficient Method
//    static int findDist(int arr[]){
//        HashSet<Integer> newSet = new HashSet<Integer>();
//        for(int i = 0;i<arr.length;i++){
//            newSet.add(arr[i]);
//        }
//        return newSet.size();
//    }
    //Covert array to list
    static int findDist(Integer arr[]){
        HashSet<Integer> newSet = new HashSet<>(Arrays.asList(arr));
        return newSet.size();
    }
}


/*
int low = 0;
        int high = 1;
        while(high<nums.length){
            if(nums[low]==nums[high]){
                high++;
            }else{
                nums[low+1]=nums[high];
                low++;
                high++;
            }
        }
        return low+1;
 */

/*
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
for(int i =0;i<nums.length;i++){
h.add(nums[i]);
}
        int j=0;
for(int x:h){
    nums[j++]=x;
}
        return h.size();
        
    }
}

 */

/*
 for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int temp = 0;
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
 */
