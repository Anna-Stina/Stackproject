
public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		s.push(8);
		s.push(6);
		s.push(5);
		s.pop();
		
		System.out.println(s);// [9, 7, 8, 6]
		String str = Integer.toString(5);
	}

}
