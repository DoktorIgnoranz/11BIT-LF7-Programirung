import java.util.Scanner;
public class Versandkosten {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total Cost: ");
		double totalCost = scanner.nextDouble();
		if(totalCost < 200)
			totalCost = totalCost + 5.95;
		System.out.println("New total Cost are " + totalCost + " EUR");
	}
}