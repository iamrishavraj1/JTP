package Encapsulation;

public class Encapusaltion {
    public static void main(String[] args) {
    Laptop l1 = new Laptop();
    l1.setPrice(22);
    }
    

    //Default init can access in only same package.
    // Public method can access from anywhere.
    public void doWork(){
        System.out.println("Working Working");
    }
    
    // Private is only access in the same class.
    private  void doWish(){
        System.out.println("Good Morning");
    }
    
    //Protected is only access by children of class
}
class Laptop{
    int ram;
    private int price;
    
    public void setPrice( int price ){
        boolean isAdmin = false;
        if(!isAdmin){
            System.out.println("You cannot access this.");
        } else {
            System.out.println("Welcome");
            this.price = price;
        }
    }
}
