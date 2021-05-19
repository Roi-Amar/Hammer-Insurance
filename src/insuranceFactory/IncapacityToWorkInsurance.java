package insuranceFactory;

public class IncapacityToWorkInsurance implements Insurance{
	private InsuranceData data;
	@Override
	public void insure() {
		System.out.println("IncapacityToWorkInsurance");
	}
	@Override
	public InsuranceData getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
