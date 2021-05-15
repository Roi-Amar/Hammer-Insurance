package insuranceFactory;

public class IncapacityToWorkInsuranceGenerator extends InsuranceGenerator{
	@Override
	public InsuranceType createInsurance() {
		return new IncapacityToWorkInsurance();
	}
}
