
public  class Zusi extends Dog {
	
	Zusi(double weight, int nails, String breed) {
		super(weight, nails, breed);
		// TODO Auto-generated constructor stub
	}
	public void bark() {
		System.out.println("wont bark");
	}
	void bite() {
		System.out.println("never bites");
	}
	void eat() {
		System.out.println("eat biscutes");
	}
	public static void main(String[] args) {
		
		rocky r1 = new rocky(10,20,"pug");
		r1.bark();
		r1.bite();
		r1.eat();
		r1.poop();
		System.out.println(r1.breed);
		System.out.println(r1.weight);
		System.out.println(r1.nails);
		System.out.println("===================");
		
		Zusi z1 = new Zusi(20,30,"lab");
		z1.bark();
		z1.bite();
		z1.eat();
		z1.poop();
		System.out.println(z1.breed);
		System.out.println(z1.weight);
		System.out.println(z1.nails);
	}

}
