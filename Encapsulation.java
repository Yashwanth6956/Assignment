
public class Encapsulation {
	private int empid;
	private int age;
	private String name;
	private static String designat;
	
public void getempid() {
	System.out.println(empid);
}
public void setempid(int empid) {
	this.empid=empid;
}
public void getage() {
	if(age>0 && age<100) {
	System.out.println(age);
}else
{
	System.out.println("foolish guy dont test me");
}
}
public void setage(int age) {
	this.age=age;
}
public void getname() {
	System.out.println(name);
	
}
public void setname(String name) {
	this.name=name;
}
public  static void getDesignat() {
	System.out.println(designat);
}
public void setDesignat(String designat) {
	this.designat = designat;
}


}
class Main {
	public static void main(String[] args) {
		Encapsulation emp = new Encapsulation();
		emp.setempid(1234);
		emp.getempid();
		emp.setage(35);
		emp.getage();
		emp.setname("yash");
		emp.getname();
		emp.setDesignat("software engg"); 
        emp.getDesignat();
	
		
		System.out.println("====================");
		
		Encapsulation emp1 = new Encapsulation();
		emp1.setempid(4321);
		emp1.getempid();
		emp1.setage(420);
		emp1.getage();
		emp1.setname("spoo");
		emp1.getname();
		emp1.setDesignat("software engineer");
		
		emp1.getDesignat();
		
		
	}
}

