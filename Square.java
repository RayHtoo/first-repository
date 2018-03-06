import java.util.Scanner;

public class Square{
  public static void main(String []args){
  	Scanner input = new Scanner(System.in);

  	System.out.print("Enter sqaure size: ");
  	int side = input.nextInt();
  	sqaureOfAstericks(side);

  	}
  	public static void sqaureOfAstericks(int side){
	  	for(int row = 1; row <= side; row++){
   	  	 for(int col = 1; col <= side; col++){
		  System.out.print("*");
  }
	  System.out.println();
  }
 }
}