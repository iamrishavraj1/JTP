package LinkedList;
import java.util.*;
public class InsertLastEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Node head = null;
        head = insertEnd(head,10);
        head = insertEnd(head,20);
        head = insertEnd(head,30);
        head = insertEnd(head,x);
    printListLast(head);
    
    }
    
    public static Node insertEnd(Node head,int x){
    
    Node temp = new Node(x);
    if(head == null){
        return temp;
    }
    Node curr = head;
    while(curr.next!= null){
        curr = curr.next;
    }
    curr.next= temp;
    return head;
    }
    
    public static void printListLast(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    
    private static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
}
