package HomeWorwMisha1;


// Розрахунок буде здійснюватись методом аннуїтентого платежу

public class Credit {
    private int sumOfCredit;
    private double annualRate;
    private int numberOfMonths;

    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    public void setSumOfCredit(int sumOfCredit) {
        this.sumOfCredit = sumOfCredit;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public int getSumOfCredit() {
        return sumOfCredit;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public Credit(int sumOfCredit, double annualRate, int numberOfMonths) {
        this.sumOfCredit = sumOfCredit;
        this.annualRate = annualRate;
        this.numberOfMonths = numberOfMonths;
    }


    public double annuityPayment() {
        double monthlyInterestRate = annualRate / 12 / 100;
        double monthlyPayment = sumOfCredit * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        return monthlyPayment;
    }
}
