
public class ReturnMethods{
public static void main (String []arg){

	ReturnMethods m = new ReturnMethods();
	int number = m.method1();
	System.out.println("method 3, returned " +number+ " to method 2, which returned it to method 1, and method 1 returned it to me.");
	Index.main(null);
}
	public int method1(){
	System.out.println("Method 1, can you please ask method 2, to ask method 3 for a number?");
	return method2();
}
	public int method2(){
	System.out.println("no problem method 2, can you ask method 3 for a number and return it to me?");
	return method3();
}
	public int method3(){
	System.out.println("of course i can method 1, method 3, can oyu please send me a number.");
	return 5;
}


}



