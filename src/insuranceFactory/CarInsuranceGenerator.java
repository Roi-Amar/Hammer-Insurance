package insuranceFactory;

public class CarInsuranceGenerator extends InsuranceGenerator {
	@Override
	public Insurance createInsurance(String price) {
		Insurance insurance = new CarInsurance();
		insurance.setData(price);
		return insurance;
	}
}
