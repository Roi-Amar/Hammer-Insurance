package insuranceFactory;

public class HealthInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance() {
		Insurance insurance = new HealthInsurance();
		return insurance;
	}
}
