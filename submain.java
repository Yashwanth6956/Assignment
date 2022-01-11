
public class submain extends main {
	 int a;
	 int b;
	 submain(int a,int b,int x,int y) {
		 super(x,y);
		 this.a=a;
		 this.b=b;
	 }
public static void main(String[] args) {
	System.out.println(main.class.getName());
	submain s1=new submain(1,2,3,4);
	System.out.println(s1.a);
	System.out.println(s1.b);
	System.out.println(s1.x);
	System.out.println(s1.y);
}
}


