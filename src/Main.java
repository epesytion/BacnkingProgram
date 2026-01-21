import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); //static object allocated outside psvm is accessible in every class
    public static void main(String[] args) {
        // java banking program
        // we need menu, get and process user's choice, showBalance(), deposit(), withdraw(), EXIT option

        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning){
            System.out.println("BANK");
            System.out.println("1. Show balance.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. Exit.");
            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
            }
        }
    }
    static void showBalance(double b){
        System.out.printf("%.2f\n Your balance: ", b);    //2 digits after dot
    }
    static double deposit(){
        double amount;
        System.out.print("How much money u wanna deposit?: ");
        amount = scanner.nextDouble();
        if (amount<0){
            System.out.println("?");
            return 0;
        }
        else{
            System.out.println("Deposited amount: " + amount);
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("недостаточно средств");
            return 0;
        } else if (amount<0) {
            System.out.println("amount can't be negative");
            return 0;
        } else {
            System.out.println("Withdrawn amount: "+amount);
            return amount;
        }
    }


}
