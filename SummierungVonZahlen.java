import java.util.Scanner;
public class SummierungVonZahlen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double input = 0;
		double value = 0;
		do {
			System.out.println("Enter a Number you wish to add:");
			input = scanner.nextDouble();
			value = value + input;
		}
		while(input != 0);
		System.out.println("The result is: " + value);
	}
}