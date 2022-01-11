import java.util.*;
import java.math.*;
public class QuadraticEqn {
	static void sqrt(double a,double b,double c) {
		// TODO Auto-generated method stub
		double d1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		double d2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println(d1);
		System.out.println(d2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		double a=sc.nextDouble();
		System.out.println("enter value of b");
		double b=sc.nextDouble();
		System.out.println("enter value of c");
		double c=sc.nextDouble();
	sqrt(a,b,c);

		
		
		
		
	}

}
