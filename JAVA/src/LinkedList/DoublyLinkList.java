package LinkedList;
import java.util.*;
public class DoublyLinkList {
    public static void main(String[] args) {
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    head.next = temp1;
    temp1.prev = head;
    temp1.next = temp2;
    temp2.prev = temp1;
    print(head);
    System.out.println("After insert at 1st");
//    head =  insertF(head,211);
//    print(head);
//    System.out.println("After insert at Last");
//    head =  insertL(head,211);
//    print(head);
//    System.out.println("After Delete at 1st ");
//    head =  deletF(head);
//    print(head);
    System.out.println("After Delete at last ");
    head =  deletL(head);
    print(head);
    
    
    }
    
    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    public static Node insertF(Node head,int data){
        Node toAdd = new Node(data);
        toAdd.next = head;
        if(head!=null){
            head.prev = toAdd;
        }
        return toAdd;
    }
    
    public static Node insertL(Node head,int data){
        Node toAddL = new Node(data);
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = toAddL;
        return head;
    }
    public static Node deletF(Node head){
    if(head == null){
        return null;
    }
    if(head.next == null){
        return null;
    } else{
        head = head.next;
        head.prev = null;
        return head;
    }
    }
    
    public static Node deletL(Node head){
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
    
    private static class Node{
        int data;
        Node prev;
        Node next;
        Node(int x){
            data = x;
            prev = null;
            next = null;
        }
    }
}
