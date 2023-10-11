package rubank;

import java.util.Objects;

public class TransactionManager {
    /**
     * Runs the program, handles input and commands O, C, D, W, P, PI, UB, Q
     * @author Ayaan Qayyum
     */
    public void run() {
        System.out.println("Transaction Manager running...");
        while (!Objects.equals(command, "Q")) {
            String input = scanner.nextLine();
            parts = input.split("\\s+");
            if (parts.length == 0) {
                System.out.println("Invalid input!");
                continue;
            }
            command = parts[0];
            switch (command) {
                case ("O"):
                    caseOpen();
                    break;
                case ("C"):
                    caseClose();
                    break;
                case ("D"):
                    caseDeposit();
                    break;
                case ("W"):
                    caseWithdraw();
                    break;
                case ("P"):
                    caseDisplay();
                    break;
                case ("PI"):
                    caseDisplayWithDetails();
                    break;
                case ("UB"):
                    caseUpdateBalance();
                    break;
                case ("Q"):
                    System.out.println("Transaction Manager is terminated.");
                    scanner.close();
                    return;
                default:
                    System.out.println(command + " is an invalid command!");
            }
        }
    }

    /**
     * Handles command O, Open.
     * @author Ayaan Qayyum
     */
    private boolean caseOpen() {
        try {

        } catch (Exception e) {
            System.out.println("Error in caseOpen: " + e.getMessage());
        }

        return true;
    }

    /**
     * Handles command C, Close.
     * @author Ayaan Qayyum
     */
    private boolean caseClose() {
        try {

        } catch (Exception e) {
            System.out.println("Error in caseClose: " + e.getMessage());
        }
        return true;
    }

    /**
     * Handles command D, Deposit.
     * @author Ayaan Qayyum
     */
    private boolean caseDeposit() {
        try {

        } catch (Exception e) {
            System.out.println("Error in caseDeposit: " + e.getMessage());
        }
        return true;
    }

    /**
     * Handles command W, Withdraw.
     * @author Ayaan Qayyum
     */
    private boolean caseWithdraw() {
        try {

        } catch (Exception e) {
            System.out.println("Error in caseWithdraw: " + e.getMessage());
        }
        return true;
    }

    /**
     * Handles command P, Display.
     * @author Ayaan Qayyum
     */
    private boolean caseDisplay() {
        try {

        } catch (Exception e) {
            System.out.println("Error in caseDisplay: " + e.getMessage());
        }
        return true;
    }

    /**
     * Handles command PI, Display With Details.
     * @author Ayaan Qayyum
     */
    private boolean caseDisplayWithDetails() {
        try {

        } catch (Exception e) {
            System.out.println("Error in caseDisplayWithDetails: " + e.getMessage());
        }
        return true;
    }

    /**
     * Handles command UB, Update Balance.
     * @author Ayaan Qayyum
     */
    private boolean caseUpdateBalance() {
        try {

        } catch (Exception e) {
            System.out.println("Error in opening: " + e.getMessage());
        }
        return true;
    }








}
