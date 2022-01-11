
public class MeathodHiding {
	static void m1() {
		System.out.println("i am static m1 of parent class ");
	}

}
class A extends MeathodHiding{
	static void m2() {
		System.out.println("i am static m1 of child class ");
	}
}
class test{
	public static void main(String[] args) {
	A.m2();
	}
}
