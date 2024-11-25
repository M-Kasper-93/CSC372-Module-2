/* Purpose of AgeCalculator class: Serves as the main class to handle core functions  */

/* This program calculates the user's age based on the entered birthday. 
 * Created by Megan Kasper on 24 November 2024
 */

package calculator.age;

import javax.swing.JFrame;

public class AgeCalculator {

	public static void main(String[] args) {
		GUI ageCalcFrame = new GUI();
		
		ageCalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ageCalcFrame.setVisible(true);

	}

}
