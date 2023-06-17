package ATM_Machine_Dispenser;

public interface AtmOperation_Interface {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public  void depositAmount(double depositAmount);
    public void viewAccountStatement();
}
