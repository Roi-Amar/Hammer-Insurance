package insuranceFactory;

public class CarInsuranceGenerator extends InsuranceGenerator {
	@Override
	public InsuranceType createInsurance() {
		return new CarInsurance();
	}
}
