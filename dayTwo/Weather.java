public class Weather { 
	public static void main(String[] arguments) {
		float fah = 86;
		System.out.println(fah + " degrees Fahrenheit is...");
		// To convert Fahrenheit into Celsius
		// Begin by subtracting 32
		fah -= 32;
		// Divide the answer by 9
		fah /= 9;
		// Multiply that answer by 5
		fah *= 5;
		System.out.println(fah + " degrees Celsius\n");

		float cel = 33;
		System.out.println(cel + " degrees Celsius is...");
		// To convert Celsius into Fahrenheit 
		// Begin by multiplying by 9
		cel *= 9;
		// Devide the ansewr by 5
		cel /= 5;
		// Add 32 to the answer 
		cel += 32;
		System.out.println(cel + " degrees Fahrenheit");
	}
}
