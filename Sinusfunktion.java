import java.util.Scanner;
import java.lang.Math;

public class Sinusfunktion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double degrees = 0;
		double sin = 0;
		double cos = 0;
		double tan = 0;
       
		System.out.println("Enter angle in degrees: ");
        degrees = scanner.nextDouble();
        
        sin = Math.sin(degrees); 
        cos = Math.cos(degrees); 
        tan = Math.tan(degrees);
        
        System.out.println("The Sine of " + degrees + " degrees is : " + sin);
        System.out.println("The Cosine of " + degrees + " degrees is : " + cos);
        System.out.println("The Tangent of " + degrees + " degrees is : " + tan); 
	}
}