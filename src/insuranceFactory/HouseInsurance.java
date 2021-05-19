package insuranceFactory;

public class HouseInsurance implements Insurance{
	private InsuranceData data;
	@Override
	public void insure() {
		System.out.println("HouseInsurance");
	}
}
