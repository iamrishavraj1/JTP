package Collection;
import java.util.*;
public class LinkHashSetLearn {
    public static void main(String[] args) {
        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(22);
        ls.add(4004);
        ls.add(222);
        ls.add(442);
        System.out.println(ls);
    }
}
