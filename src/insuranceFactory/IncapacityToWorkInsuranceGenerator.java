package insuranceFactory;

public class IncapacityToWorkInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance(String price) {
		Insurance insurance = new IncapacityToWorkInsurance();
		insurance.setData(price);
		return insurance;
	}
}
