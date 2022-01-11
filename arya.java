import javax.sound.midi.SysexMessage;

public class arya  extends Yuva{
	static int m1()
	{
		System.out.println("i am m1 of class arya");
		return 2;
	}
    static int m2()
{
  System.out.println("iam m2 of class arya");
  return 2;
}
      int m3() {
    	 System.out.println("iam m3 of class arya");
    	 return 3;
     }
      public static void main(String[] args) {
    	  m1();
    	  m2();
    	  Yuva y=new Yuva();
    	 y.m3();
    	 y.m4();
    	 arya a=new arya();
    	 a.m1();
    	 m1();
    	 y.m1();
    	 m1();
		
	}
}
