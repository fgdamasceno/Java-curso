package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int numberOfEmployees() {
		return 0;
	}

	@Override
	public double tax() {
		double taxPaid = 0.0;

		if (numberOfEmployees <= 10) {
			taxPaid = super.getAnualIncome() * 0.16;
		} else {
			taxPaid = super.getAnualIncome() * 0.14;
		}

		return taxPaid;
	}
	
	@Override
	public String toString() {
		return super.getName() + String.format(": $ %.2f", tax());
	}

}
