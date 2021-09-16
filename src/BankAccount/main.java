package BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lineArguments = reader.readLine().split(" ");
        Map<Integer,Bank> accounts = new HashMap<>();
        String command = lineArguments[0];
        while (!command.equals("End")){
            String result = "";
            switch (command){
                case "Create":
                    Bank account = new Bank();
                    accounts.put(account.getId(),account);
                    result = "Account ID" + account.getId() + " created";
                break;
                case "Deposit":
                    int acountId = Integer.parseInt(lineArguments[1]);
                    double amount = Double.parseDouble(lineArguments[2]);
                    Bank currentAccount = accounts.get(acountId);
                    if (currentAccount == null){
                        result = "Account does not exist";
                        break;
                    }
                    currentAccount.deposit(amount);
                    accounts.put(acountId,currentAccount);
                    result = String.format("Deposited %.0f to ID%d", amount,acountId);
                    break;

                case "SetInterest":
                    double interestRate = Double.parseDouble(lineArguments[1]);
                    Bank.setInterestRate(interestRate);
                break;
                case "GetInterest":
                    int acountId2 = Integer.parseInt(lineArguments[1]);
                    int years = Integer.parseInt(lineArguments[2]);
                    Bank currentAccount2 = accounts.get(acountId2);
                    if (currentAccount2 == null){
                        result = "Account does not exist";
                        break;
                    }
                    Double currenAccountInterest = currentAccount2.getInterestRate(years);
                    result = String.format("%.2f",currenAccountInterest);
                    break;

            }
            if (!result.isEmpty()) {
                System.out.println(result);
            }
            lineArguments = reader.readLine().split(" ");
            command = lineArguments[0];
        }
    }




}
