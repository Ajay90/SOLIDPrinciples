public interface InterestCalculation {
  double calculateInterest(double balance);
}

public class SavingsInterestCalculation implements InterestCalculation{

  public double calculateInterest(double balance){
    return balance * 0.05;
  }
  
}

public class CurrentInterestCalculations implements InterestCalculation{

  public double calculateInterest(double balance){
    return balance * 0.01;
  }
  
}
