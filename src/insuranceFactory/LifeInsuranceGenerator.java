package insuranceFactory;

public class LifeInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance() {
		Insurance insurance = new LifeInsurance();
		return insurance;
	}
}
