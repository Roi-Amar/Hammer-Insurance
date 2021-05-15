package insuranceFactory;

public class HouseInsuranceGenerator extends InsuranceGenerator{
	@Override
	public InsuranceType createInsurance() {
		return new HouseInsurance();
	}
}
