package studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Student> al = new ArrayList<Student>();
	
		System.out.println("Student List (ordered by name)");
	    Student s1 = new Student(101, "Kim", 23);
	    al.add(s1);
	    Student s2 = new Student(102, "Choi", 21);
	    al.add(s2);
	    Student s3 = new Student(103, "Park", 24);
	    al.add(s3);
	    Student s4 = new Student(104, "Jeon", 20);
	    al.add(s4);
	    Student s5 = new Student(105, "Lee", 22);
	    al.add(s5);
	    Student s6 = new Student(106, "Kim", 23);
	    al.add(s6);
	    Student s7 = new Student(107, "Cho", 23);
	    al.add(s7);
	    Student s8 = new Student(108, "Kim", 25);
	    al.add(s8);
	    al.add(new Student(109, "Lee", 24));
	    
	    Collections.sort(al);
	    
	    for(Student s : al) {
	    	
	    	System.out.println(s.toString());
	    	
	    }
		
	}

}
