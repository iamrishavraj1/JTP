package Searching;

public class IntroBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int x = 4;
        int low = 0;
        int high = arr.length-1;
//        System.out.println(findX(arr,x));
        System.out.println(findXRRec(arr,x,low,high));
    }
    
//    public static int findX(int[] arr,int x){
////        for(int i = 0;i<arr.length;i++){
////            if(arr[i]==x){
////                return i;
////            }
////        }
////        return -1;
//        int low = 0;
//        int high = arr.length-1;
//
//
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(arr[mid]==x){
//                return mid;
//            }
//          else if(arr[mid]>x){
//            high = mid-1;
//
//            }
//          else{
//              low = mid+1;
//
//            }
//
//        }
//        return -1;
//    }
    
    
    public static int findXRRec(int[] arr, int x, int low, int high){
       
        if(low > high) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x) return mid;
        else if(arr[mid]>x) return findXRRec(arr,x,mid-1,high);
        else return findXRRec(arr,x,low,mid+1);
        
        
    }
}
