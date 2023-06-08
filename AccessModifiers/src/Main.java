// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Account alexAccount = new Account("Tim");
        alexAccount.deposit(1000);
        alexAccount.withdraw(500);
        alexAccount.withdraw(-200);
        alexAccount.deposit(-20);
        alexAccount.calculateBalance();
        alexAccount.balance = 5000;

        System.out.println("balance on account is " + alexAccount.getBalance());
        alexAccount.transactions.add(4500);
        alexAccount.calculateBalance();
        }
    }
