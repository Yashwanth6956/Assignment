package challanges;

public class Program4 {
	public boolean isCatPlaying(String summer, int temp) {
		if(summer==summer&&temp>=25&&temp<=45) {
			return true;
		}
		else if(summer!=summer&&temp>=25&&temp<=35) {
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Program4 program4 = new Program4();
		System.out.println(program4.isCatPlaying("winter",44));
	}

}
