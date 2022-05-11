package OOPs;

import Encapsulation.Encapusaltion;

public class intro {
    public static void main(String[] args) {
        //Classes and Object
        //Creating Object
        Student rishav = new Student();
        rishav.fullName = "Rishav Raj";
        rishav.rollNumber = 60012;
        
        Student rashi = new Student();
        rashi.fullName = "Rashi Mishra";
        rashi.rollNumber = 60079;
        
        Student anupam = new Student("Anupam Praksh",60021);
    
        System.out.println(rashi.fullName +" "+ rishav.fullName);
        rashi.read();
        rishav.write();
        
        rashi.walkWithSteps(10);
        rishav.walkWithSteps(20);
        
        rashi.read(10);
        rishav.read(5);
        
        anupam.read();
        anupam.write();
    
        System.out.println(Student.count);
    
        Developer rounik = new Developer("Rounik Prashar",60023);
        rounik.read();
        rounik.write();
    
        
        //Here we call the another package function to main function because Encapsulation is in public method.
        Encapusaltion obj = new Encapusaltion();
        obj.doWork();
        
    }
   
    
   
}
//Creating Inheritance
class Developer extends  Student{
    public Developer(String fullName,int rollNumber){
        // super keyword is for calling the properties of parent class.
        super(fullName,rollNumber);
    }
    void write(){
        System.out.println(fullName + " is writing clean code");
    }
}


    //Creating Class
    class Student{
        String fullName;
        int rollNumber;
        //Static keyword is for creating properties of class. we don't need to create object.
      static  int count;
        //Checking that default constructor is calling or not.
        public Student(){
            count++;
            System.out.println("Yes ! Student is calling");
        }
        
        //Creating Constructor Overload
        public Student(String fullName ,int rollNumber){
            //Using this keyword we can call the another constructor in any other constructor.
            // this keyword also use for access the parameters of other constructor
            //this.fullName = fullName;
//            this();
            this.fullName = fullName;
            this.rollNumber = rollNumber;
//            fullName = newName;
//            rollNumber = newRollNumber;
        }
        
        //Creating Methods
        void read(){
            System.out.println(fullName + " is reading");
        }
        void write(){
            System.out.println(fullName + " is writing");
        }
        
        //Creating Methods with Parameters
        void walkWithSteps(int step){
            System.out.println(fullName + " is walked  " + step + " steps");
        }
        
        
        void read(int count){
            System.out.println(fullName + " read " + count + " books daily");
        }
        }
