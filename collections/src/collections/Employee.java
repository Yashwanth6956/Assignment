package collections;

public class Employee {
	int empId;
	String name;
	double salary;
	
	Employee(int empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
