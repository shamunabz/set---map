package com.sa;

import java.util.HashMap;
import java.util.Map;

public class mapdemo {
public static void main(String[] args) {
	Map<String,Integer>numbers =new HashMap<>();
//  Map<String, Integer> numbers = new TreeMap<>();
	numbers.put("One", 1);
	numbers.put("Two", 2);
    numbers.put("Three", 3);
    numbers.put("Four", 4);
    numbers.put("Five", 5);


    //numbers.remove("Three");

//    if(!numbers.containsKey("Two")) {
//        numbers.put("Two", 23);
//    }

//    numbers.putIfAbsent("Two", 23); //this line will help if u dont want to override
    System.out.println(numbers);
    System.out.println(numbers.containsValue(3));

    System.out.println(numbers.isEmpty());

//    for (Map.Entry<String, Integer> e: numbers.entrySet()) {  //entery set will return the value in the set
//        System.out.println(e);
//
//        System.out.println(e.getKey());
//        System.out.println(e.getValue());
//    }
//
//    for (String key: numbers.keySet()) {
//        System.out.println(key);
//    }
//
//    for(Integer value: numbers.values()) {
//        System.out.println(value);
//    }

}
}

