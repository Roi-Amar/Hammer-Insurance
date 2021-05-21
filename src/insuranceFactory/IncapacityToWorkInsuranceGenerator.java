package insuranceFactory;

public class IncapacityToWorkInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance() {
		Insurance insurance = new IncapacityToWorkInsurance();
		return insurance;
	}
}
