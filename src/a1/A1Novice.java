package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int shoppers = scan.nextInt();
		for (int x = shoppers; x > 0; x--) {
			String firstName = scan.next();
			String init = Character.toString(firstName.charAt(0));
			String lastName = scan.next();
			// Name scanner
			
			int groceryTypes = scan.nextInt();
			double itemSums = 0;
			double itemPrice = 0;
			double itemTotal = 0;
			if (groceryTypes <= 1) {
				int multiples = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				itemPrice = (multiples * price);
				itemSums = itemPrice;
				System.out.println(init + ". " + lastName + ": " + itemSums);
			} else {
				for (int y = groceryTypes; y > 0; y--) {
					int multiples = scan.nextInt();
					String item = scan.next();
					double price = scan.nextDouble();
					double z = 0;
					itemPrice = (multiples * price);
					z = itemPrice;
					itemSums = itemPrice + z;
				}
				System.out.println(init + ". " + lastName + ": " + itemSums);
				} 
				
			
				// Scanning prices of items bought per person
				// Sum machine added
				
				
				
				// need a way to separate names out of this to only do it once
				// need to make sum and name into one output line
				// System.out.println(init + ". " + lastName + ": " + itemTotal);
				
				// String.format(%.2f, insert double name here) converts
				// Double to a string w/ 2 decimal points
			}
		}
		
	}
