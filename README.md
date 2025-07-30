**>> ATM Simulation System <<**
Semester: 6th Semester minor Project

Course: B.Tech in Computer Science & Engineering

College: Technocrats Institute of Technology & Science, Bhopal

Academic Year: 2024–2025

Team Size: 4 Members

Project Overview
The ATM Simulation System is a simple Java-based console application designed to simulate the core functionalities of an ATM. It allows a user to interact with an account using a PIN-based login and perform the following operations:

Balance enquiry

Cash withdrawal

Cash deposit

Mini statement generation

This application was developed using Core Java, with a strong focus on Object-Oriented Programming (OOP) principles. It is built to simulate a real-world ATM experience for a single user account with emphasis on input validation, logical flow, and clean code structure.

Team Members & Roles
Name	Role / Contribution
Ghanshyam Sharma	Designed the logic for various user scenarios, handled validations and error handling throughout the application. Actively involved in writing and debugging the core Java code.
Deependra Shivhare -	Developed the user interface (console prompts), handled menu structure and user flow.
Ghanshyam Sharma - - 	Helped design account and transaction logic, assisted with testing and validations.
Ajay Rajak - - - - -  Contributed to documentation and assisted in reviewing logic and overall structure.

Technologies Used
Java (Core Java)

Object-Oriented Programming (Encapsulation, Classes, Objects, Methods)

Eclipse IDE (for coding and execution)

Features Implemented
PIN-based login with validation

Balance enquiry with proper formatting

Cash deposit with positive value check

Withdrawal with balance check to prevent overdraft

Mini statement showing user name and current balance

Clean and user-friendly console-based menu system

How to Run the Project
Open the project in Eclipse IDE or any other Java IDE.

Ensure all .java files are in the same folder/package.

Run the ATMSimulator.java file.

Use the following test credentials when prompted:

PIN: 1234

My Contribution
I, Ghanshyam Sharma, was responsible for designing the application logic and implementing the core functionality. My role specifically included:

Writing Java code for deposit, withdrawal, balance enquiry, and mini statement

Implementing input validation (e.g., no negative amounts, balance checks)

Handling error messages and ensuring the system gives clear user feedback

Maintaining code readability and using OOP concepts like encapsulation and object creation

Throughout the development, I was actively involved in writing, debugging, and reviewing the Java code. I made sure we applied proper coding standards and logical structure to deliver a clean, working simulation.
<img width="237" height="283" alt="image" src="https://github.com/user-attachments/assets/3a63c02a-0363-4508-9910-02d7b9198439" />
<img width="760" height="627" alt="image" src="https://github.com/user-attachments/assets/e5e633f7-9aeb-44de-8486-ada0eeba65e1" />
<img width="1364" height="655" alt="image" src="https://github.com/user-attachments/assets/aa3ae351-d4a9-49c8-95d0-d3f65e5746a8" />
<img width="368" height="576" alt="image" src="https://github.com/user-attachments/assets/add05ddd-f251-4de8-b0db-6c16a85996ba" />

**___________________________________________________________________________________________________________________________________________________________________________________**

**ATM Simulation System – Testing Document**
Course: B.Tech in Computer Science & Engineering
Semester: 6th Semester Project
College: Technocrats Institute of Technology, Bhopal
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
