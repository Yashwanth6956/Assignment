package collections;

public class MyArrayList {

	Object[] array;
	int pos;

	public MyArrayList(int size) {
		array = new Object[size];

	}

	public void add(Object ob) {
		if (pos >= array.length) {
			grow();
		}
		array[pos] = ob;
		pos++;
	}

	public void grow() {
		Object[] temp = new Object[(array.length * 3) / 2 + 1];
		for (int i = 0; i <= array.length; i++) {
			temp[i] = array[i];

		}
		array = temp;

	}
}
