
 public class MeathodOverloading {
	 
	// ex 1- meathod overloading with diff type of data types
	// public void login(String un, String pwd) {
	//	  System.out.println("your user name is"+un);
	//	  System.out.println("your pwd is"+pwd);
	// }
	// public void login(String un, String pwd,long pno) {
	//	  System.out.println("your user name is"+un);
	//	  System.out.println("your pwd is"+pwd);
	//	  System.out.println("your pno is"+pno);
	// }  
	 	 
	 //ex 2-meathod overloading with change the no of paramaters
	 //  public void add(int x,int y) {
	//   System.out.println(x+y);
    // }
	// public void add(int x,int y,int z) {
	//   System.out.println(x+y+z);
    // }
	 
	 //if we use static we can access directly using meathod name within same class
	 
	 //ex-3 args meathods (*impt)
	// public static int[] add(int...x) {
		// int[] result;
		 //result = new int[1];
		 //for(int i=0;i<x.length;i++) {
			// result[0] +=x[i];
		 //}
		 //return result;
	// }
	 
	   
		 
	 
	 
	 public static void main(String[] args) {
		 //ex1 (calling ex1)
		// MeathodOverloading m1 = new MeathodOverloading();
		// m1.login("yash123","12345");
		// m1.login("yuva1997","45678", 7892186956l);
		 
		 //ex2 (calling ex2)
		// MeathodOverloading m2 = new MeathodOverloading();
		 //m2.add(2, 5);
		 //m2.add(5, 10, 15);
		 
		 //ex3 (calling ex3)
		// for(int i=0;i<1;i++) {
		//	 System.out.println(add(1,2,3)[i]);
		// }
		 
		//System.out.println(add(1,2,3));
		 
		 
		 
		 
		 
		 
		 
		
	}
	
    
	
	}


