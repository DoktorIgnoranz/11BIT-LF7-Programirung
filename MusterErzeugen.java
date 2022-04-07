import java.util.Scanner;
public class MusterErzeugen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loop = 1;
		do {
			System.out.println("Enter the amount of Rows: ");
			loop = loop + scanner.nextInt();
		}
		while(loop < 1 || loop > 21);
		for(int i = 0; i < loop; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}