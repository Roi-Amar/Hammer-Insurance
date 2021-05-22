package insuranceFactory;

public class HealthInsurance implements Insurance{
	private InsuranceData data;
	
	public HealthInsurance() {
		data = new InsuranceData(600);
	}
	
	@Override
	public void insure() {
		System.out.println("HealthInsurance");
	}

	@Override
	public InsuranceData getData() {
		// TODO Auto-generated method stub
		return data;
	}
	
	public String getName() {
		return "health";
	}
}
