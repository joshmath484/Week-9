package week9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	public static int optionInt;

	public static void main(String[] args) {
		options();
		try {
		    // create scanner instance
		    Scanner scanner = new Scanner(Paths.get("Users.csv").toFile());

		    // set comma as delimiter
		    scanner.useDelimiter(",");

		    // read all fields
		    while (scanner.hasNext()) {
		        System.out.print(scanner.next() + " ");
		    }

		    //close the scanner
		    scanner.close();

		} catch (FileNotFoundException ex) {
		    ex.printStackTrace();
		}
	}
	
	public static void options() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("1 Build Users Tree");
		System.out.println("2 Find by IP Address");
		System.out.println("3 Find by Username");
		System.out.println("4 Report Number of Nodes");
		System.out.println("5 Print Entire Tree");
		System.out.println("6 Exit");
		System.out.println("-------------------------");
		System.out.print("Enter 1, 2, 3, 4, 5 or 6: ");
		optionInt = scanner.nextInt();
		System.out.println();
		switch(optionInt) {
		case 1:
			//NEED HELP HERE
		break;
		case 2:
			//NEED TO HAVE NUMBER ONE FINISHED TO DO THIS
		break;
		case 3:
			//NEED TO HAVE NUMBER ONE FINISHED TO DO THIS
		break;
		case 4:
			//NEED TO HAVE NUMBER ONE FINISHED TO DO THIS
		break;
		case 5:
			//NEED TO HAVE NUMBER ONE FINISHED TO DO THIS
		break;
		case 6:
			System.out.println("Thank you, and have a wonderful day! :)");
			System.exit(0);
		break;
		}
	}
}
