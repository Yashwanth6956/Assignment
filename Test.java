
public class Test extends MeathodOverloading {
	 void meathod1() {

		System.out.println("i am meathod of class test");
	}
	 void meathod1(char a) {
		System.out.println(a);
		System.out.println("i am also meathod of class test");
	}
	public static void main(String[] args) {
		MeathodOverloading m1=new MeathodOverloading();
		m1.meathod1();
		m1.meathod1();
		Test t2=new Test();
		t2.meathod1();
		t2.meathod1();
		
	
	
		
	
		
	}
	static {
		System.out.println("iam the danger static");
	}

}

