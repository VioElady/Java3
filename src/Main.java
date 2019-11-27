
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ModifiedAccountClass account1 = new ModifiedAccountClass("Jane Green", 50.00);
        ModifiedAccountClass account2 = new ModifiedAccountClass("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2 input: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.printf("Enter withdraw amount for %s ",account1.getName());
        double withdrawAmount = input.nextDouble();
        account1.withdraw(withdrawAmount);
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
    }
}