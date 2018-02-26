import java.util.Scanner;

public class Sales{
public static void main(String []args){
	Scanner input = new Scanner (System.in);

	double total = 0;
	int productId;

	System.out.println("Please enter a product number:");
	productId = input.nextInt();

	while(productId != 0){
		System.out.println("Enter quantity sold:");
		int qauntity = input.nextInt();

		switch(productId){
			case 1:
				total += qauntity * 2.98;
				break;
			case 1:
				total += qauntity * 4.50;
				break;
			case 1:
				total += qauntity * 9.98;
				break;
			case 1:
				total += qauntity * 4.49;
				break;
			case 1:
				total += qauntity * 6.87;
				break;
			}
		}else if (productId != 0)
			System.out.println("productId must be 1 to 5");

		 System.out.print("Please enter a product number (0 to stop):");
		 productId = input.nextInt();
		}
		 System.out.print("Total of product sold is: ");
	     System.out.println("Math.round(total*10000.0/10000.0)"));
	}
}