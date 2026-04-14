package Collections;

import java.util.*;
public class HashSetEx {
    public static void main(String[] args){
        HashSet<String>set=new HashSet<String>();
        set.add("Andy");
        set.add("Priya");
        set.add("John");

        Iterator<String>itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
