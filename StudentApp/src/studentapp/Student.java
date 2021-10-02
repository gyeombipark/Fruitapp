package studentapp;

public class Student implements Comparable<Student> {
	int no;
	String name;
	int age;
	
	public Student(int i, String string, int j) {
		no=i;
		name=string;
		age=j;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
		
	}
	public String toString(){
		return "Student [no="+no+", name="+name+", age="+age+"]";
		
	}

}
