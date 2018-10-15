import java.util.Scanner;

public class NameValidationApp {

	public static void main(String[] args) {
		// Lab 7
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter a valid Name: ");
		String userName = userInput.nextLine();
		if (validateName(userName)) {
			System.out.println("Name is Valid.");
		} else {
			System.out.println("Sorry, name is not valid");
		}

		System.out.println();

		System.out.println("Please enter a valid email: ");
		String userEmail = userInput.nextLine();
		if (validateEmail(userEmail)) {
			System.out.println("Email is Valid.");
		} else {
			System.out.println("Sorry, email is not valid");
		}

		System.out.println();

		System.out.println("Please enter a valid phone number: ");
		String userPhone = userInput.nextLine();
		if (validatePhone(userPhone)) {
			System.out.println("Phone is Valid.");
		} else {
			System.out.println("Sorry, phone is not valid");
		}

		System.out.println();

		System.out.println("Please enter a valid date: ");
		String userDate = userInput.nextLine();
		if (validateDate(userDate)) {
			System.out.println("Date is Valid.");
		} else {
			System.out.println("Sorry, date is not valid");
		}

		System.out.println();

		System.out.println("Please enter html elements");
		String userHTML = userInput.nextLine();
		if (validateHTML(userHTML)) {
			System.out.println("Element tag is Valid.");
		} else {
			System.out.println("Sorry, element tags are not valid");
		}

		userInput.close();

	}

	/**
	 * @param userHTML
	 */
	private static boolean validateHTML(String userHTML) {

		if (userHTML.matches("<[a-z]><(/)[a-z]>")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param userDATE
	 */
	private static boolean validateDate(String userDate) {

		if (userDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param userPhone
	 */
	private static boolean validatePhone(String userPhone) {

		if (userPhone.matches("(\\d{3}-){2}\\d{4}")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param userEmail
	 */
	private static boolean validateEmail(String userEmail) {

		if (userEmail.matches("\\w{5,30}@\\w{5,10}.\\w{2,3}")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param userName
	 */
	private static boolean validateName(String userName) {

		if (userName.matches("\\w{5,30} \\w{5,30}")) {
			return true;
		} else {
			return false;
		}

	}

}
