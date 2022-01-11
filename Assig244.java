import java.util.Scanner;

public class Assig244 {
	static void meathod(int...a) {
			System.out.println(a[0]);
			System.out.println(a[1]);
	}
	public static void main(String[] args) {
		Assig244 a1 = new Assig244();
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of the array");
	    int size =s.nextInt();
	    int[] array=new int[size];
	    System.out.println("enter elements");
	
	   for(int i=0;i<size;i++) {
		  
		   array[i]=s.nextInt();
	   }
		meathod(array);	 
}
}
