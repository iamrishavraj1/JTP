package LinkedList;

public class Intro {
    public static class Node{
        int data;
        Node next;
        Node(int x ){
            data=x;
            next = null;
            
        }
    }
    
    public static void main(String[] args) {
    Node h1 = new Node(10);
    Node h2 = new Node(20);
    Node h3 = new Node(30);
    Node head = h1;
    head.next = h2;
    h2.next = h3;
    h3.next = null;
    traverse(head);
    }
    
    
    public static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    
    
    
    
}
