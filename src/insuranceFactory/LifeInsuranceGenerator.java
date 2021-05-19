package insuranceFactory;

public class LifeInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance(String price) {
		Insurance insurance = new LifeInsurance();
		insurance.setData(price);
		return insurance;
	}
}
