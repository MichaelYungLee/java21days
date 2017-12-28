public class Divider {
	public static void main(String[] args) {
		int numOne = 5;
		int numTwo = 27;
		System.out.println("The first number is " + numOne);
		System.out.println("The second number is " + numTwo);
		int result = numTwo / numOne;
		int remainder = numTwo % numOne;
		System.out.println("The result and remainder are " + result + "\t" + remainder);
	}
}
