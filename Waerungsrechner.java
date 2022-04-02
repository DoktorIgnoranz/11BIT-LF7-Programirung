import java.util.Scanner;
import java.lang.Math;
public class Waerungsrechner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int conversationSetting = 0;
        //Checks for USD to EUR or EUR to USD Conversation and set Variabel
        do {
        	System.out.println("Enter 1 if you wish to convert EUR to USD, enter 2 if you wish to convert USD to EUR:");
        	conversationSetting = scanner.nextInt();
        }
        while(conversationSetting < 1 || conversationSetting > 2);
        String old_currency;
        String new_currency;
        if(conversationSetting == 1) {
        	old_currency = "EUR";
        	new_currency = "USD";
        }else {
        	old_currency = "USD";
        	new_currency = "EUR";
        };
        // Get Value that has to be converted
        double old_value = 0;
        do {
        System.out.println("Please how much " + old_currency + " you wish to convert:");
        old_value = scanner.nextDouble();
        }
        while(old_value < 0);
        double new_value = 0;       
        switch(conversationSetting) {
        case 1:
        	new_value = old_value * 1.11; 
        	break;
        case 2:
        	new_value = old_value * 0.90;
        	break;
        default:
        	System.out.println("An unexspeceted Error occoured!");
        	break;
        }
        System.out.println(old_value + " "+ old_currency + " is currently " + Math.round(new_value*100.0)/100.0 + " " + new_currency);
	}
}
