import java.util.Scanner;
public class Assig24 {
	 int res;
	void add(int a) {
		res=res+a;
	   System.out.println(res);
	}
	public static void main(String[] args) {
		Assig24 a1 = new Assig24();
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of the array");
	    int size =s.nextInt();
	    int[] array=new int[size];
	    System.out.println("enter elements");
	   for(int i=0;i<size;i++) {
		  
		   array[i]=s.nextInt();
		   a1.add(array[i]);
		  
	   }
	    	
	    	
	}

}

