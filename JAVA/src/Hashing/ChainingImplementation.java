package Hashing;
import java.util.*;
public class ChainingImplementation {
    public static void main(String[] args) {
        Myhash sh = new Myhash(7);
        sh.insert(10);
        sh.insert(20);
        sh.insert(15);
        sh.insert(7);
        System.out.println(sh.search(10));
        sh.delete(15);
        System.out.println(sh.search(15));
    }
}

class Myhash {
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    Myhash(int b){
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(Integer k){
        int i = k % bucket;
        table.get(i).add(k);
    }
    boolean search(Integer k){
        int i = k % bucket;
        return table.get(i).contains(k);
    }
    void delete(Integer k){
        int i = k % bucket;
        table.get(i).remove(k);
    }
}
