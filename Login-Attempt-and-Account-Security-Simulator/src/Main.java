public class Main {
    public static void main(String[] args) {

        // Correct credentials
        String correctUsername = "Priya";
        int correctPIN = 3456;

        // Attempt 1
        String username1 = "Kavya";
        int pin1 = 1234;

        // Attempt 2
        String username2 = "Riya";
        int pin2 = 1111;
    
        // Attempt 3
        String username3 = "Priya";
        int pin3 = 3456;

        int attempt = 1;
        int maxAttempts = 3;
        boolean loginSuccess = false;

        System.out.println("LOGIN SECURITY REPORT\n");

        while (attempt <= maxAttempts && !loginSuccess) {

            String enteredUsername;
            int enteredPIN;

            // Select credentials based on attempt number
            switch (attempt) {
                case 1 -> {
                    enteredUsername = username1;
                    enteredPIN = pin1;
                }
                case 2 -> {
                    enteredUsername = username2;
                    enteredPIN = pin2;
                }
                default -> {
                    enteredUsername = username3;
                    enteredPIN = pin3;
                }
            }

            System.out.println("Attempt " + attempt);

            // Check username
            boolean usernameCorrect = enteredUsername.equals(correctUsername);
            System.out.println("Username Status: "
                    + (usernameCorrect ? "Correct" : "Incorrect"));

            // Check PIN
            boolean pinCorrect = (enteredPIN == correctPIN);
            System.out.println("PIN Status: "
                    + (pinCorrect ? "Correct" : "Incorrect"));

            // Nested condition for login
            if (usernameCorrect) {
                if (pinCorrect) {
                    loginSuccess = true;
                    System.out.println("Login Result: Successful");
                    System.out.println("\nWelcome, " + correctUsername + ".");
                } else {
                    System.out.println("Login Result: Failed");
                }
            } else {
                System.out.println("Login Result: Failed");
            }

            // Display remaining attempts if login failed
            if (!loginSuccess) {
                int remainingAttempts = maxAttempts - attempt;
                System.out.println("Remaining Attempts: " + remainingAttempts);

                // Ternary operator
                String accountStatus = (remainingAttempts == 0)
                        ? "Account Locked"
                        : "Account Active";

                System.out.println("Account Status: " + accountStatus);
            }

            System.out.println();

            attempt++; // Increment operator
        }

        // Final message
     if (!loginSuccess) {
        System.out.println("Account Status: Account Locked");
        System.out.println("Final Message: Account locked after 3 failed attempts.");
    } 
    else {
        System.out.println("Account Status: Account Active");
        System.out.println("Final Message: Login completed successfully.");
    }
  
    }
}