package BankAccount2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        HashMap<Integer,Bank>totalAccounts = new HashMap<>();

        while (!line.equals("End")){
            String[] argument = line.split(" ");
            String command = argument[0];
            String result = "";
            switch (command){
                case "Create":
                    Bank account = new Bank();
                    totalAccounts.put(account.getId(),account);
                    result = "Account ID"+ account.getId() + " created";
                    break;

                case "Deposit":
                    int accointId = Integer.parseInt(argument[1]);
                    double amount = Double.parseDouble(argument[2]);
                    Bank currentAccount = totalAccounts.get(accointId);
                    if (currentAccount == null){
                        result = "Account does not exist";
                        break;
                    }else {
                        currentAccount.deposit(amount);
                        totalAccounts.put(accointId,currentAccount);
                        result = String.format("Deposited %.0f to ID%d", amount,accointId);
                        break;
                    }
                case "setInterest":
                    double intterestRate = Double.parseDouble(argument[1]);
                    Bank.setInterestRate(intterestRate);
                    break;
                case "GetInterest":
                    int account2 = Integer.parseInt(argument[1]);
                    int years = Integer.parseInt(argument[2]);
                    Bank currentAccount2 = totalAccounts.get(account2);
                    if (currentAccount2 == null){
                        result = "Account does not exist";
                        break;
                    }
                    Double currentIterest = currentAccount2.getInterestRate(years);
                    result = String.format("%.2f",currentIterest);
                    break;
            }
            if (!result.isEmpty()){
                System.out.println(result);
            }


            line = reader.readLine();
        }
    }
}
