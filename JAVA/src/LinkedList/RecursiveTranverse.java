package LinkedList;

import org.w3c.dom.Node;

public class RecursiveTranverse {
    public static void main(String[] args) {
    Node temp = new Node(10);
    temp.next = new Node(20);
    temp.next.next = new Node(30);
    temp.next.next.next = new Node(40);
    temp.next.next.next.next = new Node(50);
    printLink(temp);
    }
    
    
    static void printLink(Node temp){
        if(temp == null){
            return;
        } else {
            System.out.println(temp.data + " ");
            printLink(temp.next);
        }
   }
   
  private static  class Node{
        int data;
        Node next;
        Node (int x){
            data = x;
            next = null;
        }
    }
    
}
