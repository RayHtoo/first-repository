import java.util.Scanner;

public class Power{
	public static void main (String []args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter base (negative to quit): ");
		int base = input.nextInt();

		while(base >= 0){
			System.out.print("Enter exponent: ");
			int exponent = input.nextInt();

			System.out.print(base+" to the "+exponent+" power is "+integerpower(base, exponent));
			System.out.print("Enter base (negative to quit): ");
			base = input.nextInt();
		}
	}

public static int integerpower(int base, int exponent){
	int product = 1;
	for(int i= 1; 1 <= exponent; i++)
	   product *= base;

	   return product;
   }

}