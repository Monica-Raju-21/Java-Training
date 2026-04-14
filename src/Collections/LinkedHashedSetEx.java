package Collections;

import java.util.*;
public class LinkedHashedSetEx {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<String>();
        set.add("Andy");
        set.add("Peter");
        set.add("John");
        set.add("Peter");
        Iterator<String>itr= set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
