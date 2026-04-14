package Collections;

import java.util.*;
public class TreeSetEx {
    public static void main(String[] args){
        TreeSet<String>set=new TreeSet<String>();
        set.add("Andy");
        set.add("Alice");
        set.add("Bob");
        set.add("Andy");
        Iterator<String>itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
