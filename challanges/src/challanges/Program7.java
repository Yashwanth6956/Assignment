package challanges;

public class Program7 {
	boolean isOdd(int number) {
		if (number % 2 == 1) {
			return true;
		} else
			return false;
	}

	int sumOdd(int start, int end) {
		if (start <= 0 && end <= 0) {
			return -1;
		} else {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				isOdd(i);
				if (true) {
					sum = sum + i;
				}
			}
			return sum;
		}

	}

	public static void main(String[] args) {
		Program7 program7 = new Program7();
		System.out.println(program7.sumOdd(34, 59));
	}


}
