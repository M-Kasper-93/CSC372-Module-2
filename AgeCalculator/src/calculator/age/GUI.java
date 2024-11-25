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
		setSize(400, 300);
		
		// panel object creation
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout()); 
		GridBagConstraints layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 10, 10);
		
		// labels
		JLabel currentDateLabel = new JLabel("Current year: ");
		JLabel birthDateLabel = new JLabel("Birth date (Enter numerically as YYYYMMDD): ");
		JLabel ageResultLabel = new JLabel(" ");
		
		// text field for current date and birthday
		JTextField currentDateField = new JTextField(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE)); 
		currentDateField.setEditable(false);
		
		JTextField birthDateField = new JTextField();
		birthDateField.setPreferredSize(new Dimension(100, 20));
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
		
		// add currentDate label and field to panel
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		panel.add(currentDateLabel, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		panel.add(currentDateField, layoutConst);
		
		// add birthDate label and field to panel
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		panel.add(birthDateLabel, layoutConst);
		
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		panel.add(birthDateField, layoutConst);
		
		// add result label to panel
		layoutConst.gridx = 2;
		layoutConst.gridy = 2;
		panel.add(ageResultLabel, layoutConst);
		
		// add button to panel
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		panel.add(calcButton, layoutConst);
		
		// add panel to frame
		add(panel);
	}	
}