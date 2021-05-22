package insuranceFactory;

public class IncapacityToWorkInsurance implements Insurance{
	private InsuranceData data;
	
	public IncapacityToWorkInsurance() {
		data = new InsuranceData(400);
	}
	@Override
	public void insure() {
		System.out.println("IncapacityToWorkInsurance");
	}
	@Override
	public InsuranceData getData() {
		// TODO Auto-generated method stub
		return data;
	}
	public String getName() {
		return "incapacity";
	}
}
