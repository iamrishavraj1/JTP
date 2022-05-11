package Abstraction;

public class Interfaces implements Car {
    public static void main(String[] args) {
    
    }
     public void setStart(){
         System.out.println("my car is starting");
     }
}
interface Car{
    void setStart();
}
