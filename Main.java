package BankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[10];
        String[][] transactionHistory = new String[10][10];
        Scanner input = new Scanner(System.in);
        int referenceNum = 0;
        int choice = 0;
        System.out.println("Welcome to Tyler Finacial! \nPlease choose one of the following options via number: ");
        while (choice != 5) { // Allows program to run continuosly until user choose to end.
            System.out.println("1) Create Account\n" +
                    "2) Deposit Money \n" +
                    "3) Withdraw Money\n" +
                    "4) Show Account Summary \n" +
                    "5) Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    caseAccountChoice(accounts, input, referenceNum, transactionHistory); // pass by reference, pass by
                                                                                          // value. pass by
                    // reference is used by objects.
                    break;
                case 2:
                    if (accounts[0] != null)
                        caseDeposit(accounts, input, transactionHistory);
                    else
                        System.out.println("Unable to perform action. Please create an account first. ");
                    break;
                case 3:
                    if (accounts[0] != null)
                        caseWithdraw(accounts, input, transactionHistory);
                    else
                        System.out.println("Unable to perform action. Please create an account first. ");
                    break;
                case 4:
                    if (accounts[0] != null)
                        caseAccountHistory(accounts, input, transactionHistory);
                    else
                        System.out.println("Unable to perform action. Please create an account first. ");
                    break;
                case 5:
                    System.out.println("Thanks for choosing Tyler Finacial. Enjoy your day. ");
                    break;
                default:
                    System.out.println("Invalid selection. Please choose one of the following options. ");
            }
        }
    }

    public static void caseAccountChoice(BankAccount[] Account, Scanner kb, int referenceNum,
            String[][] transactionHistory) { // Account here is the
        // same as the one from
        // main,
        // due to pass by reference.
        System.out.println("\n========================================\n");
        System.out.println(
                "We offer the best rates in Wayne county! Please choose one of the following options via number: \n");
        System.out.println("1) Savings Account\n" +
                "2) Checking Account \n" +
                "3) Student Account \n" +
                "4) Fixed Deposit Account \n" +
                "5) Business Account \n" +
                "6) Exit");
        int selection = kb.nextInt();
        switch (selection) { // Different cases for the account user has chosen. Loop makes sure array is
                             // null before input.
            case 1:
                System.out.print("Deposit Amount: ");
                double amount = kb.nextDouble();
                if (amount < 0) {
                    System.out.println("\nPlease re-select 'Create Account' and re-enter a positive value.\n");
                    return;
                } else
                    for (int i = 0; i < Account.length; i++) {
                        if (Account[i] == null) {
                            Account[i] = new SavingsAccount(amount);
                            transactionHistory[i][0] = Account[i].getAccountType(); // Account type stored in first
                                                                                    // coloumn
                            transactionHistory[i][i] = "Deposited: $" + amount;
                            referenceNum = i;
                            break;
                        }
                    }
                System.out.println("\nSavings account created. Your account number is " + referenceNum);
                System.out.println("\n========================================\n");
                break;
            case 2:
                System.out.print("Deposit Amount: ");
                double amount1 = kb.nextDouble();
                if (amount1 < 0) {
                    System.out.println("\nPlease re-select 'Create Account' and re-enter a positive value.\n");
                    return;
                } else
                    System.out.print("Overdraft Limit: ");
                double overdraftLim = kb.nextDouble();
                for (int i = 0; i < Account.length; i++) {
                    if (Account[i] == null) {
                        Account[i] = new CheckingAccount(amount1, overdraftLim);
                        referenceNum = i;
                        transactionHistory[i][0] = Account[i].getAccountType();
                        transactionHistory[i][i] = "Deposited: $" + amount1;
                        break;
                    }
                }
                System.out.println("\nChecking account created. Your account number is " + referenceNum);
                System.out.println("\n========================================\n");
                break;
            case 3:
                System.out.print("Deposit Amount: ");
                double amount2 = kb.nextDouble();
                if (amount2 < 0) {
                    System.out.println("\nPlease re-select 'Create Account' and re-enter a positive value.\n");
                    return;
                } else
                    for (int i = 0; i < Account.length; i++) {
                        if (Account[i] == null) {
                            Account[i] = new StudentAccount(amount2);
                            transactionHistory[i][0] = Account[i].getAccountType();
                            transactionHistory[i][i] = "Deposited: $" + amount2;
                            referenceNum = i;
                            break;
                        }
                    }
                System.out.println("\nStudent account created. Your account number is " + referenceNum);
                System.out.println("\n========================================\n");
                break;
            case 4:
                System.out.print("Deposit Amount: ");
                double amount3 = kb.nextDouble();
                if (amount3 < 0) {
                    System.out.println("\nPlease re-select 'Create Account' and re-enter a positive value.\n");
                    return;
                } else
                    for (int i = 0; i < Account.length; i++) {
                        if (Account[i] == null) {
                            Account[i] = new FixedDepositAccount(amount3, 0);
                            transactionHistory[i][0] = Account[i].getAccountType();
                            transactionHistory[i][i] = "Deposited: $" + amount3;
                            referenceNum = i;
                            break;
                        }
                    }
                System.out.println("\nFixed Deposit account created. Your account number is " + referenceNum);
                System.out.println("\n========================================\n");
                break;
            case 5:
                System.out.print("Deposit Amount: ");
                double amount4 = kb.nextDouble();
                if (amount4 < 0) {
                    System.out.println("\nPlease re-select 'Create Account' and re-enter a positive value.\n");
                    return;
                } else
                    for (int i = 0; i < Account.length; i++) {
                        if (Account[i] == null) {
                            Account[i] = new BusinessAccount(amount4);
                            transactionHistory[i][0] = Account[i].getAccountType();
                            transactionHistory[i][i] = "Deposited: $" + amount4;
                            referenceNum = i;
                            break;
                        }
                    }
                System.out.println("\nBusiness account created. Your account number is " + referenceNum);
                System.out.println("\n========================================\n");
                break;
            case 6:
                System.out.println("\nThanks for choosing Tyler Finacial. Enjoy your day. ");
                break;
            default:
                System.out.println("\nInvalid input.");
        }
    }

    public static void caseDeposit(BankAccount[] Account, Scanner kb, String[][] transactionHistory) {
        System.out.println("\n========================================\n");
        System.out.println("Please eneter your Account number");
        int selection = kb.nextInt();
        if (selection > Account.length || Account[selection] == null) {
            System.out.println("\nInvalid account number.\n");
            return;
        }
        System.out.println("Deposit : ");
        double deposit = kb.nextDouble();
        if (deposit < 0) {
            System.out.println("\nPlease re-select 'Deposit Money' and enter a positive value.\n");
            return;
        } else
            Account[selection].deposit(deposit);
        int i = 0; // used for loop as a counter and check
        for (; transactionHistory[selection][i] != null && i < transactionHistory[selection].length; i++) {
        }
        if (i == transactionHistory[selection].length) {
            System.out.println("\nError. Deposit limit has been reached.\n"); // Notify user there is no more room for
                                                                              // deposits/Withdrawls
                                                                              // as I set the limit to 10.
            return;
        } else {
            transactionHistory[selection][i] = "Deposited: $" + deposit; // String saved to row of chosen account.
            System.out.println(
                    "\n$" + deposit + " has been deposited into your " + Account[selection].getAccountType() + "\n" +
                            "New balance: $" + Account[selection].balance + "\n");
        }
    }

    public static void caseWithdraw(BankAccount[] Account, Scanner kb, String[][] transactionHistory) {
        System.out.println("\n========================================\n");
        System.out.println("Please eneter your Account number");
        int selection = kb.nextInt();
        if (selection > Account.length || Account[selection] == null) {
            System.out.println("\nInvalid account number.\n");
            return;
        }
        System.out.println("Withdraw : ");
        double withdraw = kb.nextDouble();
        if (withdraw < 0) {
            System.out.println("\nPlease re-select 'Withdraw Money' and enter a positive value.\n");
            return;
        } else if (withdraw > Account[selection].balance) {
            System.out.println("Request exceeds account balance.");
            return;
        }
        Account[selection].withdraw(withdraw);
        int i = 0;
        for (; transactionHistory[selection][i] != null && i < transactionHistory[selection].length; i++) {
        }
        if (i == transactionHistory[selection].length) {
            System.out.println("\nError. Withdraw limit has been reached.\n");
            return;
        } else {
            transactionHistory[selection][i] = "Withdrew: $" + withdraw;
            System.out.println(
                    "\n$" + withdraw + " has been withdrew from your " + Account[selection].getAccountType() + "\n" +
                            "New balance: $" + Account[selection].balance + "\n");
        }
    }

    public static void caseAccountHistory(BankAccount[] Account, Scanner kb, String[][] transactionHistory) {
        System.out.println("\n========================================\n");
        System.out.println("Please eneter your Account number");
        int selection = kb.nextInt();
        if (selection > Account.length || Account[selection] == null) {
            System.out.println("\nInvalid account number.\n");
            return;
        }
        System.out.println("\nHistory: ");
        for (int i = 0; i < transactionHistory[selection].length; i++) { // Prints all of the transactions on account
                                                                         // chosen
            if (transactionHistory[selection][i] != null) {
                System.out.println(transactionHistory[selection][i]);
            }
        }
    }
}
