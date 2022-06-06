package Arrays.Operations;

import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int x = 4;
        deleteElement(arr,x);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
    
    public static int deleteElement(int[] arr,int x){
        int i;
        for(i = 0;i<arr.length;i++){
            if(arr[i]==x){
                break;
            }
        }
        for(int j = i;j<arr.length-1;j++){
            arr[j] = arr[j+1];
        }
        return arr[arr.length-1]=0;
        
       
    }
}
