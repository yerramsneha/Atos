package Basic;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an string: ");
		String s = sc.nextLine();
		System.out.println("Entered string: " + s);
		
		
		System.out.println("Enter an integer no: ");
		int a = sc.nextInt();
		System.out.println("Entered no: " + a);
		
		System.out.println("Enter an integer no: ");
		float b = sc.nextFloat();
		System.out.println("Entered no: " + b);
	}

}
