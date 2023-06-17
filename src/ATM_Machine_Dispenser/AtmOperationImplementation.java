package ATM_Machine_Dispenser;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplementation implements AtmOperation_Interface{
    ATM atm = new ATM();
    Map<Double, String> bankStatement = new HashMap<>();


    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalnace());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 200 == 0) {

            if (withdrawAmount <= atm.getBalnace()) {
                bankStatement.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalnace(atm.getBalnace() - withdrawAmount);
                viewBalance();

            } else {
                System.out.println("Insufficient Funds  !!");
            }

        }else {
            System.out.println("Please Enter Amount In Multiple of 200 pounds ");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        bankStatement.put(depositAmount, " Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully");
        atm.setBalnace(atm.getBalnace() + depositAmount);
        viewBalance();

    }

    @Override
    public void viewAccountStatement() {
        for(Map.Entry<Double, String> m:bankStatement.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());

        }

    }
}
