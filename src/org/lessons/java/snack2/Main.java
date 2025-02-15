package org.lessons.java.snack2;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            boolean isRunning = false;
            System.out.printf("YHZ Bank International %nDo you want enter?(y/n)%n");
            String choice = input.nextLine();
            if(choice.replaceAll("\\s+","").equalsIgnoreCase("y")){  //case insesitive
                isRunning = true;
            }

            if(isRunning) {
                boolean isRunningUser = true;
                System.out.println("Welcome, please insert your account number: ");
                int accountnumber = input.nextInt();
                BankAccount user1 = new BankAccount(accountnumber);

                while(isRunningUser){
                    System.out.printf("Please choose an option: %n1. Check your balance. %n2. Deposit money. %n3. Withdraw money. %n4. Exit.%n");
                    int choiceMenu = input.nextInt();
                    switch (choiceMenu) {
                        case 1:
                            user1.printBalance();
                            break;
                        case 2:
                            System.out.println("Please insert the amount to deposit:");
                            BigDecimal xadd = input.nextBigDecimal();
                            user1.setAddBalance(xadd);
                            break;
                        case 3:
                            System.out.println("Please insert the amount to withdraw: ");
                            BigDecimal xless = input.nextBigDecimal();
                            user1.setLessBalance(xless);
                            break;
                        case 4:
                            isRunningUser = false;
                            break;
                        default:
                            System.out.println("Choice not valid.");
                    }
                }
                input.nextLine();
                //CLEAN THE BUFFER!! If you use nextLine() AFTER nextInt() without clearing the buffer, the programme may skip the input!
            }
        }
        //input.close();  already automatic exit at programme exit.
    }
}
