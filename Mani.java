
public class Mani implements Cloneable {
    int a=10;
    String name="manisha";
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
		Mani m1 = new Mani();
		
		
		Mani r = (Mani)m1.clone();
		try {
			m1.clone();
			System.out.println(m1.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
