package insuranceFactory;

public class LifeInsurance implements InsuranceType{
	@Override
	public void insure() {
		System.out.println("LifeInsurance");
	}
}
