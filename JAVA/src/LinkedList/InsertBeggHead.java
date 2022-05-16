package LinkedList;
import java.util.*;
public class InsertBeggHead {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Node head = null;
        head = insertBegin(head,30);
        head = insertBegin(head,20);
        head = insertBegin(head,10);
        head = insertBegin(head,x);
        printLink(head);
    }
    
    static Node insertBegin(Node head,int x){
    Node temp = new Node(x);
    temp.next = head;
    return temp;
    }
    
    public static void printLink(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " " );
            curr=curr.next;
        }
    }
    
    private static class Node{
        int data;
        Node next;
        Node (int x){
            data = x;
            next = null;
        }
    }
}
