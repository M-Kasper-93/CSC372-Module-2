/* Purpose of Date class: Contains variables and methods for the current date and birthday 
 * Reference materials for implementing LocalDate: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html */

package calculator.age;

import java.time.LocalDate;
import java.time.Period;

public class Date {
    private LocalDate currentDate;
    private LocalDate birthDate;

    // parameterized constructor
    public Date(LocalDate birthDate) {
        this.currentDate = LocalDate.now(); 
        this.birthDate = birthDate; 
    }

    // calculate age
    public int calculateAge() {
        if (birthDate == null) {
            throw new IllegalStateException("Birth date must be set to calculate age.");
        }

        Period period = Period.between(birthDate, currentDate);
        return period.getYears(); 
    }
}
