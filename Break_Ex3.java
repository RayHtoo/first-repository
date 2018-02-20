import java.util.Scanner;

public class Break_Ex3 {
	public static void main(String []args){
	Scanner input = new Scanner (System.in);
	int counter= 0;

	System.out.println("Guess a number from 1 to 10");
	System.out.println("you have 10 attempts:");

	while(input.hasNext()){
		if((input.nextInt() ==8) || (counter == 10)){
			System.out.println("you guess right (8), game over");
			break;
		}
		counter++;
		if(counter == 10){
			System.out.println("10 attempts only");
			break;
		}
	}
}
}
