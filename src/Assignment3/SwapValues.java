package Assignment3;

public class SwapValues {

	public static void main(String[] args) {
		
		int x=10;
		int y=15;
		
		System.out.println("before swap");
		System.out.println( "first number="+ x);
		System.out.println( "second number="+ y);
		
		x=x-y;
		y=x+y;
		x=y-x;
		
		System.out.println("after swap");
		System.out.println( "first number="+ x);
		System.out.println( "second number="+ y);

	}

}
