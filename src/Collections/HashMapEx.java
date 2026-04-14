package Collections;

import java.util.HashMap;
import java.util.Map;
public class HashMapEx {
    public static void main(String[] args){
        Map<String,Integer>map=new HashMap<>();
        map.put("Alice",10);
        map.put("Bob",20);
        map.put("Charlie",30);

        System.out.println("Value for 'Alice':"+map.get("Alice"));
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+":"+value);
        }
        map.remove("Charlie");
        if(map.containsKey("Bob")){
            System.out.println("Map contains key Bob");
        }

    }
}
