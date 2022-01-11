package challanges;

public class Program2 {
	public double area(double rad) {
		if(rad>=0) {
			double area=3.14*rad*rad;
			return area;
		}
		else
			return -1.0;
	}
	
	public double area(double x,double y) {
		if(x>=0&&y>=0) {
			double area=x*y;
			return area;
		}
		else
			return -1.0;
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		System.out.println(program2.area(4.5));
		System.out.println(program2.area(20, 10.80));
	}
	


}

	
