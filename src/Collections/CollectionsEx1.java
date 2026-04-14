package Collections;

import java.util.*;
public class CollectionsEx1 {
    public static void main(String[] args){
        Collection<String>list=new ArrayList<>();
        list.add("Rahul");
        list.add("Priya");
        list.add("Hitha");

        for(String name:list){
            System.out.println(name);
        }
    }
}
