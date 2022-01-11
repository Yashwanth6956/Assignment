import java.util.*;
public class Calculator {
	void addition(int a,int b) {
		
		System.out.println("sum="+(a+b));
		}
	void multiplication(int a ,int b) {
		System.out.println("mul="+a*b);
	}
	void subtraction (int a,int b) {
		System.out.println("sub="+ (a-b));
	}
	void division(int a , int b) {
		System.out.println("div="+ a/b);
	}
	public static void main(String[] args) {
	Calculator c=	new Calculator();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a");
	int n=sc.nextInt();
	System.out.println("enter value of b");
	int m=sc.nextInt();
       c.addition(n,m);
       c.multiplication(n,m);
       c.subtraction(n, m);
       c.division(n,m);
       
       
       
       
	
	}
}
