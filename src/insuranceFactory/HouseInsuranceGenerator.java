package insuranceFactory;

public class HouseInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance() {
		Insurance insurance = new HouseInsurance();
		return insurance;
	}
}
