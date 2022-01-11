
public class user {
	static int x=10;
public static void main(String[] args) {
	user u=new user();
	u.x=20;
	
	user u1=new user();
	u1.x=30;
	System.out.println(u1.x);
	System.out.println(u.x);
	System.out.println(u.x);
}
}
