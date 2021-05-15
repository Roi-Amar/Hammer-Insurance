package insuranceFactory;

public class LifeInsuranceGenerator extends InsuranceGenerator{
	@Override
	public InsuranceType createInsurance() {
		return new LifeInsurance();
	}
}
