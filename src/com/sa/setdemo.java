package com.sa;

import java.util.HashSet;
import java.util.Set;

public class setdemo {
	public static void main(String[] args) {
		
	      Set<Student> studentSet = new HashSet<>();

	        studentSet.add(new Student("Anuj", 2));
	        studentSet.add(new Student("Ramesh", 4));
	        studentSet.add(new Student("Shivam", 3));

	        studentSet.add(new Student("Rohit", 2));
	        
System.out.println(studentSet);
		
		
	//	Set<Integer>set = new HashSet<>();
		//set.add(12);
		//set.add(1);
		//set.add(22);
		//set.add(55);
		
		//System.out.println(set);
//      set.remove(54);
//      System.out.println(set);
//      System.out.println(set.contains(21));
//      System.out.println(set.isEmpty());
//      System.out.println(set.size());
//      set.clear();
//      System.out.println(set);

  }
}


