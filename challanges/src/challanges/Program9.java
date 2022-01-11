package challanges;

public class Program9 {
	static int getEvenDigitSum(int number) {
		if (number > 1) {
			int sum=0;
			for (int i = 1; i <= number; i++) {
				if (i % 2 == 0) {
					 sum = sum + i;
				}
			}
			return sum;
		}
		else
			return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(23));
	}


}
