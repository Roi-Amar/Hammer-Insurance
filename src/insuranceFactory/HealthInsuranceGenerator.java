package insuranceFactory;

public class HealthInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance(String price) {
		Insurance insurance = new HealthInsurance();
		insurance.setData(price);
		return insurance;
	}
}
