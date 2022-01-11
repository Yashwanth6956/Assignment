package challanges;

public class Program8 {
	static int sumFirstAndLastDigit(int number) {
		if (number > 0) {
			int lastDigit = number % 10;
			while (number > 0) {
				number = number / 10;
				if (number < 10) {
					int firstNumber = number;
					int sum = lastDigit + firstNumber;
				}
				
			}
			
			return sum;
			
		} 
		else
			return -1;
	}

	public static void main(String[] args) {
		int n = sumFirstAndLastDigit(2345);
		System.out.println(n);
	}

	

}
