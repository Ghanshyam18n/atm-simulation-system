>> ATM Simulation System <<                                                                                               
Semester: 6th (Semester Minor Project)  
Course: B.Tech in Computer Science & Engineering  
College: Technocrats Institute of Technology & Science, Bhopal  
Academic Year: 2024–2025  
Team Size: 4 Members  

--------------------------------------------------

Project Overview:

This is a simple Java-based console application that simulates the basic functionalities of an ATM machine. The system allows the user to log in using a secure PIN and perform basic banking operations such as:

- Checking account balance  
- Withdrawing cash  
- Depositing cash  
- Viewing a mini statement  

The project focuses on using core Java concepts and follows Object-Oriented Programming principles like encapsulation and modular class design. It’s built for single-user simulation and ensures input validation and smooth user interaction.

--------------------------------------------------

Team Members & Their Roles:

- Ghanshyam Sharma – Designed the logic for handling different user scenarios, worked on validations and error handling, and contributed actively to writing and reviewing the Java code.

- Deependra Shivhare – Worked on the user interface (console prompts), designed the menu structure, and helped with user flow design.

- Ajay Rajak – Supported in writing methods related to account operations like withdrawal and deposit, and assisted in testing.

- Sachin kumar – Took part in writing documentation, reviewed the overall logic structure, and gave suggestions for improvements.

--------------------------------------------------

Technologies & Tools Used:

- Java (Core Java)  
- Object-Oriented Programming Concepts  
- Eclipse IDE for development and testing  

--------------------------------------------------

Features Implemented:

- Secure login using a 4-digit PIN  
- Deposit functionality with input checks  
- Withdrawal functionality with balance validation  
- Balance enquiry with formatted output  
- Mini statement showing account holder details and balance  
- Simple and easy-to-use menu-driven interface  

--------------------------------------------------

How to Run the Project:

1. Open the project folder in Eclipse or any Java IDE.  
2. Make sure all `.java` files are placed in the same package.  
3. Run the `ATMSimulator.java` file.  
4. When prompted, enter the following PIN to login:   → `1234`

--------------------------------------------------

My Contribution (Ghanshyam Sharma):

As a part of the team, I was primarily responsible for designing how the application should behave during different operations. I wrote major parts of the code related to deposit, withdrawal, balance enquiry, and mini statement features.

I also implemented input validations to prevent negative amounts and overdraft situations. Apart from this, I helped debug the overall system and ensured that the logic was structured well using proper OOP principles.

This project helped me strengthen my understanding of Java and how to build real-world console-based applications using clean code and user-focused design.

--------------------------------------------------

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

 
ATM SIMULATION SYSTEM - TESTING DOCUMENT

Course: B.Tech in Computer Science & Engineering  
Semester: 6th Semester Minor Project  
College: Technocrats Institute of Technology & Science, Bhopal  
Team Size: 4 Members  
Tested By: Ghanshyam Sharma  
Testing Type: Manual Functional Testing

--------------------------------------------------
1. Purpose of Testing
--------------------------------------------------
The main goal of testing this ATM Simulation System was to check that every feature works as expected. 
We tested all the key functionalities like login, withdrawal, deposit, balance enquiry, and mini statement. 
We also made sure the system handles invalid inputs properly.

--------------------------------------------------
2. Test Environment Setup
--------------------------------------------------
Programming Language : Core Java  
IDE Used             : Eclipse IDE  
Platform             : Console-based Java application  
Operating System     : Windows 10 / 11  
Input Type           : Console (keyboard input)  
Test Data Used       : Account PIN = 1234  

--------------------------------------------------
3. Test Scenarios and Results
--------------------------------------------------

Login Functionality  
- Input: 1234 → Expected: Access granted → Result: Pass  
- Input: 0000 → Expected: Access denied  → Result: Pass  

Balance Enquiry  
- Input: Option 1 → Expected: Show current balance → Result: Pass  

Deposit Functionality  
- Input: 2000  → Expected: Deposit successful     → Result: Pass  
- Input: -500  → Expected: Invalid deposit amount → Result: Pass  
- Input: 0     → Expected: Invalid deposit amount → Result: Pass  

Withdrawal Functionality  
- Input: 3000   → Expected: Withdrawal successful     → Result: Pass  
- Input: 50000  → Expected: Insufficient balance      → Result: Pass  
- Input: -100   → Expected: Invalid withdrawal amount → Result: Pass  

Mini Statement  
- Input: Option 4 → Expected: Show name and balance → Result: Pass  

Exit Functionality  
- Input: Option 5 → Expected: Exit message displayed → Result: Pass  

--------------------------------------------------
4. Bugs Observed
--------------------------------------------------
No bugs were found during the testing process.  
All functionalities performed as expected and handled valid as well as invalid input cases properly.

--------------------------------------------------
5. Summary and Conclusion
--------------------------------------------------
We performed manual testing on the ATM Simulation System to ensure that the system behaves correctly under different scenarios.  
The application responded well to both correct and incorrect inputs.  
All core functions such as login, deposit, withdrawal, balance enquiry, and mini statement worked without any issues.  
The system is ready for academic submission and meets the project objectives.
