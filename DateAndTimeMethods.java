import java.util.Scanner;

public class DateAndTimeMethods {

    // Method to handle user input and determine if the date and time are valid
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");

        // Loop to allow the user to input multiple dates/times or exit
        while (true) {
            String input = sc.nextLine().trim();

            // Check if the user wants to quit the program
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Good bye");
                break;
            }

            // Check if the input date and time are valid
            if (isValid(input)) {
                System.out.println("The date and time is valid!");
            } else {
                System.out.println("The date and time is not valid");
            }

            // Ask if the user wants to exit or continue
            System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
        }

        sc.close();
    }

    // Method to check if the full date and time string is valid
    public boolean isValid(String dateTime) {
        // Split the input into date and time parts
        String[] parts = dateTime.split(" ");
        if (parts.length != 2) {
            return false; // Invalid format if there are not exactly two parts
        }

        String datePart = parts[0];
        String timePart = parts[1];

        return isValidDate(datePart) && isValidTime(timePart);
    }

    // Method to check if the date part (MM/DD) is valid
    public boolean isValidDate(String date) {
        // Split the date into month and day
        String[] dateParts = date.split("/");
        if (dateParts.length != 2) {
            return false; // Invalid format if there are not exactly two parts
        }

        int month = getMonth(date);
        int day = getDay(date);

        // Check if the month is between 1 and 12
        if (month < 1 || month > 12) {
            return false;
        }

        // Check if the day is valid for the given month
        if (day < 1 || day > getMaxDaysInMonth(month)) {
            return false;
        }

        return true;
    }

    // Method to check if the time part (hh:mm) is valid
    public boolean isValidTime(String time) {
        // Split the time into hour and minute
        String[] timeParts = time.split(":");
        if (timeParts.length != 2) {
            return false; // Invalid format if there are not exactly two parts
        }

        int hour = getHour(time);
        int minute = getMinute(time);

        // Check if the hour is between 1 and 12
        if (hour < 1 || hour > 12) {
            return false;
        }

        // Check if the minute is between 0 and 59
        if (minute < 0 || minute > 59) {
            return false;
        }

        return true;
    }

    // Method to get the month from a date string (MM/DD)
    public int getMonth(String date) {
        String[] dateParts = date.split("/");
        return Integer.parseInt(dateParts[0].trim());
    }

    // Method to get the day from a date string (MM/DD)
    public int getDay(String date) {
        String[] dateParts = date.split("/");
        return Integer.parseInt(dateParts[1].trim());
    }

    // Method to get the hour from a time string (hh:mm)
    public int getHour(String time) {
        String[] timeParts = time.split(":");
        return Integer.parseInt(timeParts[0].trim());
    }

    // Method to get the minute from a time string (hh:mm)
    public int getMinute(String time) {
        String[] timeParts = time.split(":");
        return Integer.parseInt(timeParts[1].trim());
    }

    // Method to get the maximum number of days in a given month
    public int getMaxDaysInMonth(int month) {
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February (Assume 28 days for simplicity)
                return 28;
            default:
                return 0;
        }
    }

    // Main method as the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the DateAndTimeMethods and run the program
        DateAndTimeMethods tester = new DateAndTimeMethods();
        tester.run();
    }
}
