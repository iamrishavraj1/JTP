package Array;
import java.util.*;
public class Delete {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr;
        arr =  new int[]{10,20,100,66,22,44,35,25,24,28};
        int element = in.nextInt();
        deleteEle(arr, element);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
    static void deleteEle(int[] arr,int element){
        int i;
        for(i = 0;i<arr.length; i++){
            if(arr[i]==element){
            
                break;
            }
        }
        for(int j=i;j<arr.length-1;j++){
            arr[j]= arr[j+1];
           
        }
        arr[arr.length-1]=0;
        
  
    }
}
