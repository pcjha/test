package sc2;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enteryour name: ");
		
		String name = input.nextLine();
		
				System.out.println("You enter your name as : " +name);
				input.close();
	}

}
