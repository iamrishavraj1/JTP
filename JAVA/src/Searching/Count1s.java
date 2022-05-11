package Searching;

public class Count1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1};
        int low = 0;
        int high = arr.length;
        System.out.println(solution(arr,low,high));
        
    }
    
    static int solution(int[] arr,int low,int high){
       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]==0){
               low = mid +1;
           }
           else{
               if(mid==0||arr[mid-1]==0){
                   return (arr.length-mid);
               }
               else{
                   high = mid -1;
               }
           }
       }
       return 0;
    }
}
