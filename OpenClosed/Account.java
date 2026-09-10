public class Account{

  private String accountNumber;
  private double balance;


  // More fields and accessor methods

  public double calculateInterest(){
    if(accountNumber.startsWith("000")) { // Savings account
      return balanc * 0.05;
    }
    else if(accountNumber.startsWith("001")) { // Current account
      return balance * 0.01;
    }
    else {
      return 0;
  }
}
