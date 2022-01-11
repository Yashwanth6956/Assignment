package collections;

public class MainAl {
	public static void main(String[] args) {
		MyArrayList list =new MyArrayList(2);
		list.add(10);
		list.add(20);
		list.add(23);
		list.add(99);
		
		for(Object o:list) {
			System.out.println(o);
		}
		
	}
	

	
	

}
