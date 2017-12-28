public class Investor {
	public static void main(String[] arguments) {
		int investment = 14000;
		System.out.println("The initial investment is $" + investment);
		double firstYearInvestment = investment * 1.4;
		System.out.println("The investment after one year is worth $" + firstYearInvestment);
		double secondYearInvestment = firstYearInvestment - 1500;
		System.out.println("The investment after two years is worth $" + secondYearInvestment);
		double thirdYearInvestment = secondYearInvestment * 1.12;
		System.out.println("The investment after three years is worth $" + thirdYearInvestment);
	}
}
