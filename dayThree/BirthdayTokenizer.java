import java.util.StringTokenizer;

class BirthdayTokenizer {
	public static void main(String[] args) {
		String birthday = "03/06/1997";
		StringTokenizer splitBirthday = new StringTokenizer(birthday, "/");
		String t1, t2, t3;
		t1 = splitBirthday.nextToken();
		t2 = splitBirthday.nextToken();
		t3 = splitBirthday.nextToken();
		System.out.println("Your birth month is: " + t1);
		System.out.println("Your birth day is: " + t2);
		System.out.println("Your birth year is: " + t3);
	}
}

