package userinputprogram;

import java.util.Scanner;

public class MyInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some Number:");
		int User_input_number = scan.nextInt();
		
		System.out.println("Entered number is:");
		System.out.println(User_input_number);

	}

}
