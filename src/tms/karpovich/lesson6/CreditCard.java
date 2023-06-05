package tms.karpovich.lesson6;

import java.util.Random;

public class CreditCard {
    private int accountNumber;
    private int balance;


    public CreditCard(){
        accountNumber = new Random().nextInt(999999) + 100000;
    }
    public CreditCard(int balance){
        accountNumber = new Random().nextInt(999999) + 100000;
        this.balance = balance;
    }

    public void topUp(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        if (balance > amount) {
            balance -= amount;
        }
        else {
            System.out.println("Not enough money");
        }
    }
    public String showInfo(){
        return "Account Number: " + accountNumber + System.lineSeparator() + "Balance: " + balance;
    }
}
