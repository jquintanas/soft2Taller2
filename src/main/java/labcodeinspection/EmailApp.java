package labcodeinspection;

import java.util.Scanner;

/**
 *  @author francescamanging
 */
public class EmailApp { //NOPMD

	/**
	 *  @author francescamanging
	 */
	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in); //NOPMD

		System.out.print("Enter your first name: ");
		final String firstName = scan.nextLine();

		System.out.print("Enter your last name: ");
		final String lastName = scan.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		final int depChoice = scan.nextInt();
		scan.close();

		final Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
