package insuranceFactory;

public class IncapacityToWorkInsurance implements InsuranceType{
	@Override
	public void insure() {
		System.out.println("IncapacityToWorkInsurance");
	}
}
