package org.lessons.java.snack2;
import java.math.BigDecimal;

public class BankAccount {
    private int accountnumber;
    private BigDecimal  balance;

    public BankAccount(int accountnumber){
        this.accountnumber = accountnumber;
        this.balance = BigDecimal.ZERO;
    }

    protected BigDecimal getBalance(){return balance;}

    protected void printBalance(){
        System.out.printf("Balance: $ %s%n",balance.toPlainString());  //using printf() x use %, toPlainString() x stamp the balance exactly as it is stored
    }

    protected void setLessBalance(BigDecimal x){
        if(x.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("Error: please insert a positive number.");
        }
        else if(x.compareTo(balance)>0){
            System.out.println("Error: withdrawal exceeds your current balance.");
        }
        else{
            balance = balance.subtract(x);
            System.out.printf("New balance: $ %s%n",balance.toPlainString());  //using printf() x use %, toPlainString() x stamp the balance exactly as it is stored
        }
    }

    protected void setAddBalance(BigDecimal x){
        if(x.compareTo(BigDecimal.ZERO)>0){  
            balance = balance.add(x);
            System.out.printf("New balance: $ %s%n",balance.toPlainString());  //using printf() x use %, toPlainString() x stamp the balance exactly as it is stored
        }
        else{
            System.out.println("Error: deposit amount must be positive.");
        }
    }
}
