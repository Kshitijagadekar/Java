package operatorexample;

public class unaryoprator {

	public static void main(String[] args) {

		int  p = 5;
		int a = 10;
		
	   System.out.println("Post Increment : " + p++);
	   System.out.println(p);
	   System.out.println("Pre Increment : " + ++p);

	   
	   System.out.println("Post Decrement : " + a--);
	   System.out.println("Pre Decrement : " + --a);

		   
			/*
			 * System.out.println(a++ + ++p);
			 * 
			 * int a = 5; int b = 7; int c = 3; int d = 4;
			 * 
			 * int result = (a>b)? ((b>c) ? 10: 20) :((d>c) ? 50 : 40);
			 * System.out.println(result);
			 */
	}

}
