package Collection;
import java.util.*;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(40);
        queue.offer(22);
        queue.offer(122);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
