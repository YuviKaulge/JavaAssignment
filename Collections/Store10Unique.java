package Collections;

import java.util.HashSet;

public class Store10Unique 
{

    public static void main(String[] args) {
        HashSet <Object> list = new HashSet<>();
       
        list.add("Samsung");
        list.add("LG");
        list.add("Apple"); 
        list.add("OnePlus");
        list.add("Nokiya");
        list.add("Apple");  // duplicate
        list.add("Jio");
        list.add("Airtel");
        list.add("Banana");
        list.add("Orenge");
        list.add("Tomato");
        list.add("Apple");         // duplicate
                
        
        
        
        list.add(null);
        
        System.out.println(list);

    }
}