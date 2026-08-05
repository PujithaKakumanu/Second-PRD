- Student Name: Pujitha Kakumanu
- Email: kakumanupujitha52@gmail.com
- Team Number: 8
- GitHub Username: PujithaKakumanu
- Assigned Requirement Number: 9
- Project Title: Login-Attempt-and-Account-Security-Simulator

## Understanding of the Requirement

The requirement is to create a Java program that simulates a login security system. The program should check a user's username and PIN using hard-coded values. The system should allow a maximum of three attempts, display the login status for each attempt, stop when login is successful, and lock the account after three failed attempts.

The program should not use any runtime input. All usernames, PIN values, and attempts should be created directly inside the Java program.

---

## Hard-Coded Values Selected

The program uses the following hard-coded values:

- Correct username: Priya
- Correct PIN: 3456
- Attempt 1 username and PIN
- Attempt 2 username and PIN
- Attempt 3 username and PIN
- Maximum allowed attempts: 3

These values are created inside the program to test both successful login and account lock scenarios.

---

## Variables and Data Types Planned

The variables planned for the program are:

- Username variables using `String` data type.
- PIN variables using `int` data type.
- Attempt counter using `int` data type.
- Maximum attempts using `int` data type.
- Login status using `boolean` data type.
- Username and PIN verification results using `boolean` data type.

---

## Expected Outputs

The program should display:

- Login security report heading.
- Attempt number.
- Username status.
- PIN status.
- Login success or failure message.
- Remaining attempts after failure.
- Account status.
- Final login message.

---

## Arithmetic Operators Planned

The subtraction operator (`-`) is used to calculate the remaining attempts.

Example:

Remaining Attempts = Maximum Attempts - Current Attempt

---

## Assignment Operators Planned

The assignment operator (`=`) is used to assign values to variables.

Example:

- Assigning usernames.
- Assigning PIN values.
- Updating login status.

---

## Relational Operators Planned

The following relational operators are used:

- `==` to compare PIN values.
- `<=` to control the number of attempts.

---

## Logical Operators Planned

Logical operators are used to combine conditions.

- `&&` is used to check multiple conditions together.
- `!` is used to check when login is not successful.

---

## Unary Operators Planned

The increment operator is used:

- `attempt++`

It increases the attempt count after each login attempt.

---

## Ternary Operator Usage

The ternary operator is used to display the account status.

If remaining attempts are zero, the account status is displayed as locked. Otherwise, the account remains active.

---

## Conditions Required

The program uses:

- `if`
- `if-else`
- Nested `if`

Conditions are used to verify:

- Username correctness.
- PIN correctness.
- Login success or failure.

---

## Loop Selected

**Loop Used:** while loop

### Reason for Selecting the Loop

The while loop is selected because login attempts need to continue repeatedly until either:

- The login becomes successful.
- The maximum number of attempts is completed.

---

## Validation Rules

The program follows these validation rules:

- Only three login attempts are allowed.
- Username must match the correct username.
- PIN must match the correct PIN.
- Account should be locked after three failed attempts.
- Login should stop immediately after successful authentication.

---

## Test Value Sets Planned

### Test Value Set 1: Successful Login

- First attempt contains incorrect credentials.
- Second attempt contains correct username and PIN.
- Program should display successful login.

### Test Value Set 2: Account Lock

- All three attempts contain incorrect credentials.
- Program should display account locked message.

---

## Conclusion

This program demonstrates the use of Java variables, data types, operators, conditions, loops, and hard-coded values to create a simple login security simulation.