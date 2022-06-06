package Arrays.Operations;

public class InsertE {
    public static void main(String[] args) {

    
        int arr[] = new int[5], cap = 5, n = 3;
    
        arr[0] = 5; arr[1] = 10; arr[2] = 20;
    
        System.out.println("Before Insertion");
    
        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    
        System.out.println();
    
        int x = 7, pos = 2;
    
        n = insertElement(arr, n, x, cap, pos);
    
        System.out.println("After Insertion");
    
        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    
}
    
    public static int insertElement(int[] arr,int n,int x,int cap,int pos){
        if(n==cap){
            return n;
        }
        int indexOfX= pos-1;
        for(int i = n-1;i>=indexOfX;i--){
            arr[i+1]=arr[i];
        }
        arr[indexOfX] = x;
        return n+1;
    }
}
