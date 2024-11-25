/* Purpose of GUI class: To contain all GUI functionality */

package calculator.age;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class GUI extends JFrame {
	int age;
	public GUI() { // frame object creation
		setTitle("Age Calculator");
		setSize(1200, 2400);
		
		// panel object creation
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout()); 
		
		// labels
		JLabel currentDateLabel = new JLabel("Current year: ");
		JLabel birthDateLabel = new JLabel("Birth date (Enter numerically as YYYYMMDD): ");
		JLabel ageResultLabel = new JLabel(" ");
		
		// text field for current date and birthday
		JTextField currentDateField = new JTextField(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE)); 
		currentDateField.setEditable(false);
		
		JTextField birthDateField = new JTextField(); 
		birthDateField.setEditable(true);
		
		// button to calculate age
		JButton calcButton = new JButton("Calculate Age");
		calcButton.addActionListener(e -> {
			String userInput = birthDateField.getText();
			try {
				LocalDate birthDate = LocalDate.parse(userInput, DateTimeFormatter.BASIC_ISO_DATE);
				Date userDate = new Date(birthDate);
				age = userDate.calculateAge();
				ageResultLabel.setText("Your age is " + age + " years.");
			} catch (DateTimeParseException ex) {
				ageResultLabel.setText("Please use YYYYMMDD format to enter birthday.");
			}
		});
		
		// add labels to panel
		panel.add(currentDateLabel);
		panel.add(birthDateLabel);
		panel.add(ageResultLabel);
		
		// add text fields to panel
		panel.add(currentDateField);
		panel.add(birthDateField);
		
		// add button to panel
		panel.add(calcButton);
		
		// add panel to frame
		add(panel);
	}	
}