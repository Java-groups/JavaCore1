package BankingProject;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String emailAddress;
    private String userName;
    private String password;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("There is no enough money on your account");
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "emailAddress='" + emailAddress + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void transfer(double amount, String userName, String emailAddress, List<Account> list) {
        if (this.balance >= amount) {
            this.balance -= amount;
            for (int i = 0; i < list.size(); i++) {
                if (userName.equals(list.get(i).getUserName()) && emailAddress.equals(list.get(i).getEmailAddress())) {
                    list.get(i).setBalance(list.get(i).getBalance() + amount);
                    System.out.println("The amount " + amount + " was send to " + list.get(i).getUserName());
                } else if (this.balance < amount) {
                    System.out.println("There is no enough money on your account!");
                }
            }
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public Account(String emailAddress, String userName, String password) {
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.password = password;
    }


}
