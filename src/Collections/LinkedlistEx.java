package Collections;

import java.util.*;

public class LinkedlistEx {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Lucy");
        al.add("Peter");
        al.add("Lucy");
        al.add("John");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
};
