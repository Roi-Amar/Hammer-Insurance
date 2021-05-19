package insuranceFactory;

public class HealthInsurance implements Insurance{
	@Override
	public void insure() {
		System.out.println("HealthInsurance");
	}
}
