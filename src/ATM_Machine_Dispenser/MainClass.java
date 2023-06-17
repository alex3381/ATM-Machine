package ATM_Machine_Dispenser;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        AtmOperation_Interface op = new AtmOperationImplementation();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Halifax Bank ATM !!! ");
        System.out.println("Enter Your ATM Number : ");
        int atmNumber = in.nextInt();
        System.out.println("Enter your ATM PIN : ");
        int atmPin = in.nextInt();
        if((atmnumber ==atmNumber) && (atmpin == atmPin)){
            System.out.println("Validation Successful");
            while (true){
                System.out.println("""
                        1.  View Available Balance\s
                        2.  Withdraw Money
                        3.  Deposit Amount
                        4.  View Transaction History
                        5.  Exit""");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if(ch == 1){
                    op.viewBalance();

                } else if (ch == 2) {
                    System.out.println("Enter Amount to Withdraw ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (ch == 3) {
                    System.out.println("Enter Amount to Deposit : ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);

                } else if (ch == 4) {
                    op.viewAccountStatement();



                } else if (ch == 5) {
                    System.out.println("Please Collect Your ATM card");
                    System.out.println("Thank You For Choosing Halifax Bank");
                    System.exit(0);
                }else {
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }else{
            System.out.println("Incorrect ATM Number Or PIN");
//            IF User fails to enter corect detail, lets exit
            System.exit(0);
        }

    }
}
