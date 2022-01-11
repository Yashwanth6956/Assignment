package collections;

public class Student {
	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		
		return rollno;
	}
	@Override
	public boolean equals(Object obj) {//tracce this part
     	if (this.rollno==rollno) {
     		return true;
			
			
		}

		return false;
	}
	
	
	

}
