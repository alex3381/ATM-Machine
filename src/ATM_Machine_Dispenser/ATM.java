package ATM_Machine_Dispenser;

    public class ATM {
    private double balnace;
    private double depositAmount;
    private double withdrawAmount;


//default constructor
    public ATM(){
}

        public double getBalnace() {
            return balnace;
        }

        public void setBalnace(double balnace) {
            this.balnace = balnace;
        }

        public double getDepositAmount() {
            return depositAmount;
        }

        public void setDepositAmount(double depositAmount) {
            this.depositAmount = depositAmount;
        }

        public double getWithdrawAmount() {
            return withdrawAmount;
        }

        public void setWithdrawAmount(double withdrawAmount) {
            this.withdrawAmount = withdrawAmount;
        }
    }