class VolcanoApplication { 
	public static void main(String [] args) {
		VolcanoRobot dante = new VolcanoRobot();
		dante.status = "exploring";
		dante.speed = 2;
		dante.temperature = 510;

		System.out.println("\nDante:");
		dante.showAttributes();
		System.out.println("Increasing speed to 3.");
		dante.speed = 3;
		dante.showAttributes();
		System.out.println("Changing temperature to 670.");
		dante.temperature = 670;
		dante.showAttributes();
		System.out.println("Checking the temperature.");
		dante.checkTemperature();
		dante.showAttributes();

		VolcanoRobot virgil = new VolcanoRobot();
		System.out.println("\nVirgil:");
		virgil.status = "roaming";
		virgil.speed = 2;
		virgil.temperature = 340;
		virgil.showAttributes();
	}
}
