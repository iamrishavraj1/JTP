package Hashmap;
import java.util.*;
public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<String, Integer>();
        m.put("Rishav",0);
        m.put("Anupam",1);
        m.put("Rounik",2);
        m.put("Harsh",3);
        m.put("Rounik",2);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String,Integer>e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        if(m.containsKey("Rishav")){
            System.out.println("True");
        }  else{
            System.out.println("No");
        }
        m.remove("Rishav");
        System.out.println(m.size());
        if(m.containsValue(3)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        System.out.println(m.get("Anupam"));
    }
}
