import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatingCode {
    public static void main(String[] args) {
        
		LocalDate currentDate = LocalDate.now();

        // Defining the custom date formats
        DateTimeFormatter format-1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format-2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format-3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Displaying the current date in different formats
        System.out.println("Current date in dd/MM/yyyy format: " + currentDate.format(format-1));
        System.out.println("Current date in yyyy-MM-dd format: " + currentDate.format(format-2));
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + currentDate.format(format-3));
    }
}