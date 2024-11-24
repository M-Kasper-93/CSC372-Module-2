/* Purpose of Date class: Contains variables, getters, and setters for the current date and birthday 
 * Reference material: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html */

package calculator.age;

import java.time.LocalDate;

public class Date {
	int year = 0000;
	int month = 00;
	int day = 00;
	LocalDate today = LocalDate.now(); // Retrieve today's date for age calculation
	LocalDate birthday = LocalDate.of(year, month, day); // User's birthdate
}
