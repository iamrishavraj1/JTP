package Collection;
import java.util.*;
public class StackLearn {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Monkey");
        animals.push("Donkey");
        animals.push("Dog");
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals);
        System.out.println(animals.peek());
    }
}
