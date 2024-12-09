/* Purpose of AgeCalculator class: Serves as the main class */

/* This program calculates the user's age based on the entered birthday. 
 * Created by Megan Kasper on 24 November 2024
 */

package calculator.age;

import javax.swing.JFrame;

public class AgeCalculator {

	public static void main(String[] args) {
		// create frame with panel, components
		GUI ageCalcFrame = new GUI();
		
		ageCalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ageCalcFrame.pack();   UPDATE this is removed to improve final display
		ageCalcFrame.setSize(900, 300);   // UPDATE made larger
		ageCalcFrame.setVisible(true);
	}
}
