package insuranceFactory;

public class HouseInsuranceGenerator extends InsuranceGenerator{
	@Override
	public Insurance createInsurance(String price) {
		Insurance insurance = new HouseInsurance();
		insurance.setData(price);
		return insurance;
	}
}
