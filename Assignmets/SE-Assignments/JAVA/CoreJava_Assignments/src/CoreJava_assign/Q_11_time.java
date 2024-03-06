package CoreJava_assign;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q_11_time {

	public static void main(String[] args) {
		
		
		// Create a formatter for "hh:mm:ss a" format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time
        String formattedTime = currentTime.format(formatter);

        System.out.println("Formatted time: " + formattedTime);

	}

}
