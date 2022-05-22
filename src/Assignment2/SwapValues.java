package Assignment2;

public class SwapValues {

	public static void main(String[] args) {
		int x = 25;
		int y = 35;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int z = x;
        x = y;
        y = z;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

	}

}
