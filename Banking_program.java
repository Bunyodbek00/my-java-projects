import java.util.Scanner;

public class Banking_program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Java Banking program

        double balance = 0;
        boolean isRunning = true;
        int choice;


        while(isRunning){
            System.out.println("_-_-_-_-_-_-_-_-_-");
            System.out.println("Banking Program");
            System.out.println("_-_-_-_-_-_-_-_-_-");

            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }

        }
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("Thank you! Have a nice day!");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.println("  ");
        System.out.printf("Your balance is $%.2f\n", balance);
        System.out.println("  ");

    }
    static double deposit(){
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        System.out.println("Your deposit has been added to your balance");
        if(amount < 0){
            System.out.println("Amount can't be negative");
            return  0;
        }else {
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("You have no enough money");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }else {
            return amount;
        }
    }
}
