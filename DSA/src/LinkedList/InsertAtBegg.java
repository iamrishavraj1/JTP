package LinkedList;
import java.util.*;
public class InsertAtBegg {
    
    
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Node head = null;
        head = insertB(head,40);
        head =insertB(head,50);
        head = insertB(head,60);
        head = insertB(head,x);
        traverse(head);
        
    }
    
    public static Node insertB(Node head,int newData){
        Node temp= new Node(newData);
        temp.next = head;
        return temp;
    }
    
    public static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
