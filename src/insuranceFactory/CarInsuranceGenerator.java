package insuranceFactory;

public class CarInsuranceGenerator extends InsuranceGenerator {
	@Override
	public Insurance createInsurance() {
		Insurance insurance = new CarInsurance();
		return insurance;
	}
}
