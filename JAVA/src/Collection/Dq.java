package Collection;
import java.util.*;
public class Dq {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(122);
        dq.offerFirst(22);
        dq.offerLast(44);
        System.out.println(dq);
        dq.offer(2222);
        System.out.println(dq);
        System.out.println(dq.peek());
    }
}
