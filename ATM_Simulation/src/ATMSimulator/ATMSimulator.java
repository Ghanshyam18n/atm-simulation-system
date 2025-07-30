package ATMSimulator;

import atm.ATM;
import atm.Account;

public class ATMSimulator {
    public static void main(String[] args) {
        Account userAccount = new Account("Ghanshyam Sharma", 1234, 10000.0);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
