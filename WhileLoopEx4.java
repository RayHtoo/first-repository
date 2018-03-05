import java.util.Scanner;

public class WhileLoopEx4{

	public static void main(String []arg){
		int counter = 0;
		int flag = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("want to loop: (0 for yes, 1 for no): ");
		if(input.nextInt() !=0){
				flag = 1;

		}

				while(flag == 0){
				System.out.print("want to loop again: (0 for yes, 1 for no): ");
				if(input.nextInt() !=0){
				flag = 1;
			}
			counter = counter + 1;
		}	System.out.println("you looped: "+counter+" times.");
	}
}

