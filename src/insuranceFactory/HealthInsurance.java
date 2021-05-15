package insuranceFactory;

public class HealthInsurance implements InsuranceType{
	@Override
	public void insure() {
		System.out.println("HealthInsurance");
	}
}
