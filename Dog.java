
public abstract class Dog {
	double weight;
	int nails;
	String breed;
	
	Dog(double weight,int nails,String breed){
		
		this.weight=weight;
		this.nails=nails;
		this.breed=breed;
		System.out.println(weight+"...."+nails+"...."+weight);
		
	}
abstract void bark();
abstract void bite();
abstract void eat();
public void poop() {
	System.out.println("its pooping");
}

}

