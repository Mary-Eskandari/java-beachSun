import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); // read the input from user
		System.out.print("principal: ");
		int principal= scanner.nextInt(); // get an integer as an input and save that in the principal
		System.out.print("Annual rate: ");
		double annualRate= scanner.nextDouble(); 
		double monthlyRate=annualRate/1200; // divide the annual rate to 12 and 100 to calculate the monthly rate
		System.out.print("number of payment: ");
		int numberOfPayment= scanner.nextInt();
		int numOfPay= numberOfPayment*12; // multiply the number of payment to the number of month
		double x= 1+monthlyRate;
		double y= Math.pow(x, numOfPay);
		double Mortgage= (principal * ((monthlyRate*y)/(y-1))); // mortgage calculation formula
		String curr= NumberFormat.getCurrencyInstance().format(Mortgage); // convert the result to currency with $ sign
		System.out.println(curr);
		
		}

}
