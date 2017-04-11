
/**@program which accepts the date in format (date month year) 
 * and print in format yyyy-mm-dd 
 */

/**@Import Scanner to input date*/
import java.util.Scanner;

/** @Defining the class */
public class DateMonth {
	/** @Main function */
	public static void main(String[] args) {
		/** @Format specific input */
		System.out.println("Enter the date given format dd/mm/yyyy or dd,mm,yyyy.");
		/** @Taking input */
		System.out.println("Enter the date: ");
		Scanner obj = new Scanner(System.in);
		String date = obj.nextLine();
		/** @Condition whether date contain */
		if (date.indexOf(",") >= 0) {
			String[] c = date.split(",");

			/** @Printing the format */
			System.out.print("Format of the date which  is updated \n" + c[2] + " " + c[1] + " " + c[0]);
		}
		/** @Else if date contain */
		if (date.indexOf("/") >= 0) {
			/** @Split from */
			String[] b = date.split("/");
			/** @Print the format */
			System.out.print("Format of the date which  is updated \n" + b[2] + " " + b[1] + " " + b[0]);
		}
	}

}