package com.test.mvcdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudent(){
	
		//Create a List 
		List<Student> students = new ArrayList<Student>(); 
		
		//Add elements to the list 
		students.add(new Student("Pranam", "Abhyuday", "xxx")); 
		students.add(new Student("Vibha", "Bhagat", "vibhabhagat88@gmail.com")); 
		students.add(new Student("www", "hhh", "ooo")); 
		
		return students; 
	
	}
}
