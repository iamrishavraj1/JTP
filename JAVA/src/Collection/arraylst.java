package Collection;

import java.util.*;

public class arraylst{
    public static void main(String[] args) {
    ArrayList<String> student = new ArrayList<>();
    // size = n then n = n+n/2+1;
    student.add("Rishav");
        System.out.println(student);
        student.add("Rashi");
        System.out.println(student);
        
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(1,50);
        System.out.println(list);
        List<Integer> newLst = new ArrayList();
        newLst.add(100);
        newLst.add(500);
        list.addAll(newLst);
        System.out.println(list);
        System.out.println(list.get(2));
        //list.remove
        //list.remove(Integer.valueOf(20));
        //list.clear();
        //list.set(2,100)
        //list.contain(40)
        
        for(int i = 0; i<list.size();i++){
            System.out.println("List is :" + list);
        }
        
        for(Integer element:list){
            System.out.println("ELement is : " + element);
        }
        
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Itreator: " + it.next());
        }
    }
}
