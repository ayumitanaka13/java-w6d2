
public class Driver {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		System.out.println("Hello");
		int[] intArray = {1, 2, 3, 4};
		
		try {
			System.out.println(a/b);
			System.out.println(intArray[30]);
		} catch(ArithmeticException ex) {
			System.err.println(ex.getMessage());
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex.getMessage());
		} catch(Exception ex) {
			System.err.println("Something wrong");
		} finally {
			System.out.println("The end of try catch block");
		}
		System.out.println("Goodbye");
	}
}
