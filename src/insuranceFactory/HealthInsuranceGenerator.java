package insuranceFactory;

public class HealthInsuranceGenerator extends InsuranceGenerator{
	@Override
	public InsuranceType createInsurance() {
		return new HealthInsurance();
	}
}
