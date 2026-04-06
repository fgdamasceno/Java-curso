package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
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
		double taxPaid = 0.0;
		double healthExpendituresDiscount = 0.0;

		if (healthExpenditures > 0) {
			healthExpendituresDiscount = healthExpenditures * 0.5;
		}

		if (super.getAnualIncome() < 20000) {
			taxPaid = super.getAnualIncome() * 0.15 - healthExpendituresDiscount;
		} else {
			taxPaid = super.getAnualIncome() * 0.25 - healthExpendituresDiscount;
		}

		return taxPaid;
	}

	@Override
	public String toString() {
		return super.getName() + String.format(": $ %.2f", tax());
	}

}
