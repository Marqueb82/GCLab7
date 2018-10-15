import java.util.Scanner;

public class NameValidationApp {

	public static void main(String[] args) {
		// Lab 7
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter a valid Name: ");
		validateName(userInput);

		System.out.println("Please enter a valid email: ");
		validateEmail(userInput);

		System.out.println("Please enter a valid phone number: ");
		validatePhone(userInput);

		System.out.println("Please enter a valid date: ");
		validateDate(userInput);

		System.out.println("Please enter html elements");
		validateHTML(userInput);

		System.out.println("Thank you goodbye.");

		userInput.close();

	}

	/**
	 * @param userInput
	 */
	private static void validateHTML(Scanner userInput) {
		String userHTML = userInput.nextLine();
		// validation
		while (!userHTML.matches("[<a-z>]+ [<\\a-z>]+")) {
			System.out.println("Sorry, element is not valid! Try again: ");
			userHTML = userInput.nextLine();
		}
	}

	/**
	 * @param userInput
	 */
	private static void validateDate(Scanner userInput) {
		String userDate = userInput.nextLine();
		// validation
		while (!userDate.matches("[0-9]{2}(/)[0-9]{2}(/)([0-9]{4})")) {
			System.out.println("Sorry, date is not valid! Try again: ");
			userDate = userInput.nextLine();
		}
	}

	/**
	 * @param userInput
	 */
	private static void validatePhone(Scanner userInput) {
		String userPhone;
		userPhone = userInput.nextLine();

		while (!userPhone.matches("(?:\\d{3}-){2}\\d{4}")) {
			System.out.println("Sorry, phone number is not valid! Try again: ");
			userPhone = userInput.nextLine();
		}
	}

	/**
	 * @param userInput
	 */
	private static void validateEmail(Scanner userInput) {
		String userEmail;
		userEmail = userInput.nextLine();
		// validation

		while ((!userEmail.matches("[a-zA-Z0-9]{5,30}+@[a-zA-Z0-9]{5,10}+\\.[a-zA-Z0-9]{2,3}$")
				|| (userEmail.length() < 5 || userEmail.length() > 30))) {
			System.out.println("Sorry, email is not valid! Try again: ");
			userEmail = userInput.nextLine();
		}
	}

	/**
	 * @param userInput
	 */
	private static void validateName(Scanner userInput) {
		String userName;
		userName = userInput.nextLine();
		// validation
		while (!userName.matches("[A-Z][a-z]* [A-Z][a-z]*")) {
			System.out.println("Sorry, name is not valid! Try again: ");
			userName = userInput.nextLine();
		}
	}

}
