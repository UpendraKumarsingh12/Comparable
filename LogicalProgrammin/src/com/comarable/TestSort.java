package com.comarable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
public static void main(String[] args) {
	ArrayList<Student>list= new ArrayList<>();
	list.add(new Student(101,"Vijay",23));  
	list.add(new Student(106,"Ajay",27));  
	list.add(new Student(105,"Jai",21)); 
	Collections.sort(list);
	for(Student s:list) {
		System.out.println(s);
	}
}
}
