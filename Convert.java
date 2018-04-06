import java.util.Scanner;

public class Convert{
 public static void main(String []args){

   Scanner scan = new Scanner (System.in);

   System.out.println("1. Fahrenheit to Celcius");
   System.out.println("2. celcius to Fahrenheit");
   System.out.println("3. Exit");
   int choice = scan.nextInt();

   double fahrenheit= 0.0;
   double celcius= 0.0;

   if(choice==1){

   		System.out.println("Enter Temperature: ");
   		fahrenheit = scan.nextInt();
   		celcius = 5.0/9.0 *(fahrenheit - 32);
   		System.out.println(+(int)fahrenheit+" Fahrenheit is "+(int)celcius+" Celcius");
		}
 	else if(choice==2){

		System.out.println("Enter Temperature: ");
		celcius = scan.nextInt();
		fahrenheit = 9.0/5.0 * celcius + 32;
		System.out.println(+(int)celcius+" Celcius is "+(int)fahrenheit+" Fahrenheit");
		}
 	}
 }