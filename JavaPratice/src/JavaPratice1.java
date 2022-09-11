import java.util.Scanner;

public class JavaPratice1 {

	public static void main(String[] args) {
		//Temperature conversion
	/*int census;
	int forn;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter foreinhiet temperature");
	forn = input.nextInt();
	census = forn-112;
	System.out.println("cesus temperature conversion " +census);*/
		
		//Checking wheather given number is positive or negative or zero
	 /*int number;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the number");
	 number = input.nextInt();
	 if(number>0) {
		 System.out.println("Given number is a positive");
	 }
	 else if(number<0){
		 System.out.println("Given number is a negative");
	 }
	 else {
		 System.out.println("Given number is a zero");
	 }*/
		
		int a;
		int b;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = input.nextInt();
		System.out.println("Enter the second number");
		b = input.nextInt();
		System.out.println("Enter the third number");
		c = input.nextInt();
		if(a>b && a>c) {
			System.out.println("First number is the largest number " + a);
		}
		else if(b>a && b>c) {
			System.out.println("Second number is the largest number " + b);
		}
		else {
			System.out.println("Third number is largest number " + c);
		}
	

	}

}
