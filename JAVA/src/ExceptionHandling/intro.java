package ExceptionHandling;

public class intro {
    public static void main(String[] args) {
        int a[] = new int[3];
       try {
           System.out.println(a[4]);
       } catch (Exception e){
           System.out.println("Error Aagya BC");
           System.out.println(e.getLocalizedMessage());
       }
    
        System.out.println("Error Parr Hogya");
    }
}
