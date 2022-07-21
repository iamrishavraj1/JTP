package Stack;

public class ArrayImplement {
    public static void main(String[] args) {
    MyStack s = new MyStack(5);
    s.push(10);
    s.push(120);
        System.out.println(s.pop());
        s.push(300);
        System.out.println(s);
    }
    
    public static class MyStack{
        int arr[];
        int cap;
        int top;
        MyStack(int c){
            top=-1;
            cap=c;
            arr=new int[cap];
        }
        
        void push(int x){
            //Handle underflow and overflow...
            if(top==cap-1){
                System.out.println("ERROR");
            }
            top++;
            arr[top]=x;
        }
        
        int pop(){
            if(top==-1){
                System.out.println("ERROR");
            }
            int res = arr[top];
            top--;
            return res;
        }
    
        int size(){
            return top+1;
        }
        boolean isEmpty(){
            return (top==1);
        }
    }
}
