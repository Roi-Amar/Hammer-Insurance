package insuranceFactory;

public class LifeInsurance implements Insurance{
	private InsuranceData data;
	@Override
	public void insure() {
		System.out.println("LifeInsurance");
	}
}
