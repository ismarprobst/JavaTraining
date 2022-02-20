package fixacaoHeranca8;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {

        if (getAnnualIncome() < 20000.00) {
            return ((getAnnualIncome() * 0.15) - (getHealthExpenditures() * 0.5));
        } else {
            return ((getAnnualIncome() * 0.25) - (getHealthExpenditures() * 0.5));
        }

    }
}
