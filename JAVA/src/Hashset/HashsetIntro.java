package Hashset;
import java.util.*;
public class HashsetIntro {
    public static void main(String[] args) {
    HashSet<String> h = new HashSet<String>();
    h.add("Rishav");
    h.add("Anupam");
    h.add("Rounik");
    h.add("Harsh");
        System.out.println(h);
        System.out.println(h.size());
        h.remove("Rishav");
        System.out.println(h.size());
        for(String s:h){
            System.out.println(s+" ");
        }
        System.out.println(h.isEmpty());
        
        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
}
