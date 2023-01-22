package BankingProject;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String homePage = """           
                       Choose an option:
                1.Create new account.  2.Sign in.
                            3.Exit
                """;
        String optionInAccount = """
                1.Check balance.      2.Withdraw   
                3.Transfer            4.Deposit  
                             5.Exit   
                """;
        File file = new File("C:/Users/Serhii Bodnar/IdeaProjects/Test1/src/BankingProject/Accounts.txt");
        List<Account> listOfAccounts = new ArrayList<>();
        listOfAccounts.add(new Account("Serhii", "Serhii1991"));
        listOfAccounts.add(new Account("Bob", "Bob2002"));
        listOfAccounts.get(0).setBalance(5000);
        listOfAccounts.get(0).setEmailAddress("serhii1991@gmail.com");
        listOfAccounts.get(1).setBalance(15000);
        listOfAccounts.get(1).setEmailAddress("bob2002@gmail.com");
        listOfAccounts.add(new Account("Alex", "Alex1993"));
        listOfAccounts.get(2).setBalance(10000);
        listOfAccounts.get(2).setEmailAddress("alex1993@gmail.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(file));
//        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));

        System.out.println("Welcome to online banking system!");
        System.out.println(homePage);
        int option = 0;
        do {
            try {
                option = Integer.parseInt(br.readLine());

                switch (option) {
                    case 1 -> {
                        System.out.println("Enter your email address: ");
                        String emailAddress = br.readLine();
                        System.out.println("Create user name:");
                        String userName = br.readLine();
                        System.out.println("Create your password:");
                        String password = br.readLine();
                        listOfAccounts.add(new Account(emailAddress, userName, password));
//                        ostream.writeObject(listOfAccounts);
                        System.out.println(homePage);


                    }
                    case 2 -> {
                        System.out.println("Enter user name:");
                        String userName = br.readLine();
                        System.out.println("Enter your password:");
                        String password = br.readLine();

                        for (int i = 0; i < listOfAccounts.size(); i++) {
                            if (userName.equals(listOfAccounts.get(i).getUserName()) && password.equals(listOfAccounts.get(i).getPassword())) {
                                System.out.println("Hi " + listOfAccounts.get(i).getUserName() + ", what you would like to do?");
                                System.out.println(optionInAccount);
                                do {
                                    option = Integer.parseInt(br.readLine());
                                    switch (option) {
                                        case 1 -> {
                                            System.out.println("Your balance is: " + listOfAccounts.get(i).getBalance());
                                            System.out.println(optionInAccount);
                                        }
                                        case 2 -> {
                                            System.out.println("How much do you want to withdraw?");
                                            double withdrawAmount = Double.parseDouble(br.readLine());
                                            listOfAccounts.get(i).withdraw(withdrawAmount);
                                            System.out.println(optionInAccount);

                                        }
                                        case 3 -> {
                                            System.out.println("How much do you want to send");
                                            double transferAmount = Double.parseDouble(br.readLine());
                                            System.out.println("Who you want sent money to?");
                                            String transferUserName = br.readLine();
                                            System.out.println("Enter email address of " + transferUserName);
                                            String emailAddress = br.readLine();
                                            listOfAccounts.get(i).transfer(transferAmount, transferUserName, emailAddress, listOfAccounts);
                                            System.out.println(optionInAccount);

                                        }
                                        case 4 -> {
                                            System.out.println("How much do you want to deposit?");
                                            double depositAmount = Double.parseDouble(br.readLine());
                                            listOfAccounts.get(i).deposit(depositAmount);
                                            System.out.println(optionInAccount);
                                        }
                                    }
                                } while (option != 5);
                                System.out.println(homePage);
                            } else if ((!userName.equals(listOfAccounts.get(i).getUserName()) && (i == listOfAccounts.size() - 1)) ||
                                    (!password.equals(listOfAccounts.get(i).getPassword()) && (i == listOfAccounts.size() - 1))) {
                                System.out.println("User name or password is invalid");
                                System.out.println(homePage);
                            }
                        }
                    }
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Invalid option. Try again!");
            }

        } while (option != 3);

        System.out.println("Thank you. See you soon");
        for (int i = 0; i < listOfAccounts.size(); i++) {
            System.out.println(listOfAccounts.get(i));
        }


    }
}
