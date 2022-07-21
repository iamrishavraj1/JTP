package Arrays.Questions;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = a.length;
        System.out.println(kadAlgo(a,n));
    }
    
    public static long kadAlgo(int[]a,int n){
        long maxSum = 0;
        long result =-1000;
        for(int i = 0;i<n;i++){
            maxSum+=a[i];
            System.out.println("max"+" "+maxSum);
            result = Math.max(result,maxSum);
          
            if(maxSum<0){
                maxSum = 0;
            }
        }
        System.out.println("max"+" "+maxSum);
        return result;
    }
}
