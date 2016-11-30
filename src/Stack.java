import java.util.Arrays;

public class Stack {

	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		String c = a.concat(b);
		System.out.println(c);
	}

	private Integer[] array;
	private int size;

	// constructor
	public Stack() {
		array = new Integer[100];
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void push(int i) {
		array[size] = i;
		size = size + 1;

	}

	public int pop() {
		if (size == 0) {
			throw new IllegalStateException("Stack is empty");
		}
		size = size - 1;
		return array[size];

	}

	// ToString
	@Override
	public String toString() {

		String result = "";
		for (int i = 0; i < size; i++) {
			String item = array[i].toString();

			if (i == size - 1) {
				result = result.concat(item);
//				 result.delete(result.substring(size-1));

			} else {
				result = result.concat(item).concat(", ");
				
			}
		}

		return "{".concat(result).concat("}");

		/*
		 * //return "Stack [array=" + Arrays.toString(array) + ", size=" + size
		 * + "]";
		 * 
		 * 
		 * return;
		 */
	}

	public int peek() {
		if (size == 0) {
			throw new IllegalStateException("Stack is empty");
		}
		return array[size - 1];
	}

}
