   >> ATM Simulation System <<
==========================================

Semester     : 6th Semester Minor Project
Course       : B.Tech in Computer Science & Engineering
College      : Technocrats Institute of Technology & Science, Bhopal
Academic Year: 2024–2025
Team Size    : 4 Members

------------------------------------------
PROJECT OVERVIEW
------------------------------------------
The ATM Simulation System is a Java-based console application designed to simulate the core functionalities of an ATM.

It allows a user to perform the following operations:
- Balance enquiry
- Cash withdrawal
- Cash deposit
- Mini statement generation

This application was developed using Core Java with a strong focus on Object-Oriented Programming (OOP) concepts such as encapsulation, classes, and objects.

It is designed to simulate a single user account and focuses on:
- Logical flow
- Input validation
- User-friendly console interaction
- Clean code structure

------------------------------------------
TEAM MEMBERS & ROLES
------------------------------------------
Name                | Role / Contribution
-----------------------------------------------------------
Ghanshyam Sharma    | Designed the logic for various user scenarios, handled validations and error handling throughout the application.
                      Actively involved in writing and debugging the core Java code.
Deependra Shivhare  | Developed the user interface (console prompts), handled menu structure and user flow.
Ghanshyam Sharma    | Helped design account and transaction logic, assisted with testing and validations.
Ajay Rajak          | Contributed to documentation and assisted in reviewing logic and overall structure.

------------------------------------------
TECHNOLOGIES USED
------------------------------------------
- Java (Core Java)
- Object-Oriented Programming (Encapsulation, Classes, Objects, Methods)
- Eclipse IDE (for coding and execution)

------------------------------------------
FEATURES IMPLEMENTED
------------------------------------------
- PIN-based login with validation
- Balance enquiry with proper formatting
- Cash deposit with positive value check
- Withdrawal with balance check to prevent overdraft
- Mini statement showing user name and current balance
- Clean and user-friendly console-based menu system

------------------------------------------
HOW TO RUN THE PROJECT
------------------------------------------
1. Open the project in Eclipse IDE or any Java IDE.
2. Ensure all .java files are in the same folder/package.
3. Run the file named: ATMSimulator.java
4. Use the following credentials when prompted:
   - PIN: 1234

------------------------------------------
MY CONTRIBUTION
------------------------------------------
My name is Ghanshyam Sharma. I was responsible for designing the core logic of the application and implementing key functionalities.

Specifically, I contributed to:
- Writing Java code for deposit, withdrawal, balance enquiry, and mini statement
- Implementing input validation (e.g., no negative amounts, sufficient balance check)
- Handling error messages and ensuring clear user feedback
- Maintaining code readability and applying OOP concepts effectively

I was actively involved in debugging and reviewing the code to ensure it meets academic and functional requirements.
----------------------------------------------------------------------------
Package Explorer >>
----------------------------------------------------------------------------
ATM_Simulation_System/
── src/
atm/
Account.java
ATMOperations.java
ATMOperationsImpl.java
ATMSimulator.java

==========================================
            >> ATM Simulation System <<
==========================================
Enter your PIN: 1234

1. View Balance
   <img width="376" height="365" alt="image" src="https://github.com/user-attachments/assets/360064d1-5d56-4192-816e-adb65f8ec439" />

3. Withdraw Amount
   <img width="230" height="152" alt="image" src="https://github.com/user-attachments/assets/abf005eb-2523-4d9c-a5da-902f3c54b9b4" />

5. Deposit Amount
   <img width="244" height="156" alt="image" src="https://github.com/user-attachments/assets/53aed350-acd6-4868-a76f-bde278eac400" />

7. View Mini Statement
   <img width="234" height="191" alt="image" src="https://github.com/user-attachments/assets/b129a581-e7d6-4e59-b68b-4de12069a8dc" />

9. Exit
   <img width="293" height="151" alt="image" src="https://github.com/user-attachments/assets/bf7ab710-436a-4552-9833-6c3a4f612540" />

 

-------------------------------------------------------------------------
**ATM Simulation System – Testing Document**
Course: B.Tech in Computer Science & Engineering
Semester: 6th Semester Project
College: Technocrats Institute of Technology & Science, Bhopal
Team Size: 4 Members
Lead Contributor: Ghanshyam Sharma
Testing Type: Manual Functional Testing

**1. Purpose of Testing**
The main purpose of testing this project was to ensure that each feature of the ATM Simulation System works as expected. We verified that the application handles both valid and invalid user inputs properly and provides appropriate responses for different actions like login, withdrawal, deposit, and balance enquiry.

2. TEST ENVIRONMENT SETUP
------------------------------------------
Programming Language : Java (Core Java)
IDE Used             : Eclipse IDE
Platform             : Console-based
Operating System     : Windows 10/11
User Input Method    : Console Keyboard Input
Test Data Used       : Account with PIN = 1234

------------------------------------------
3. TEST SCENARIOS & RESULTS
------------------------------------------

-- LOGIN FUNCTIONALITY --
Test Case: Correct PIN
Input    : 1234
Expected : Access granted
Result   : Pass

Test Case: Incorrect PIN
Input    : 0000
Expected : Access denied
Result   : Pass

-- BALANCE ENQUIRY --
Test Case: Check balance
Input    : Option 1
Expected : Show current balance
Result   : Pass

-- DEPOSIT FUNCTIONALITY --
Test Case: Valid amount
Input    : 2000
Expected : Deposit successful
Result   : Pass

Test Case: Negative amount
Input    : -500
Expected : Invalid deposit amount
Result   : Pass

Test Case: Zero amount
Input    : 0
Expected : Invalid deposit amount
Result   : Pass

-- WITHDRAWAL FUNCTIONALITY --
Test Case: Valid amount
Input    : 3000
Expected : Withdrawal successful
Result   : Pass

Test Case: Amount > Balance
Input    : 50000
Expected : Insufficient balance
Result   : Pass

Test Case: Negative amount
Input    : -100
Expected : Invalid amount
Result   : Pass

-- MINI STATEMENT --
Test Case: View mini statement
Input    : Option 4
Expected : Show name and balance
Result   : Pass

-- EXIT FUNCTIONALITY --
Test Case: Exit program
Input    : Option 5
Expected : Exit message displayed
Result   : Pass

------------------------------------------
4. BUGS OBSERVED
------------------------------------------
No bugs or errors were observed. All features performed correctly and handled both valid and invalid cases as expected.

------------------------------------------
5. SUMMARY & CONCLUSION
------------------------------------------
The ATM Simulation System has been thoroughly tested using manual inputs. The program behaves correctly across all scenarios and provides a smooth user experience. It is ready for academic submission.
