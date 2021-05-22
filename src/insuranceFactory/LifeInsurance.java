package insuranceFactory;

public class LifeInsurance implements Insurance{
	private InsuranceData data;
	
	public LifeInsurance() {
		data = new InsuranceData(43);
	}
	@Override
	public void insure() {
		System.out.println("LifeInsurance");
	}
	@Override
	public InsuranceData getData() {
		// TODO Auto-generated method stub
		return data;
	}
	
	public String getName() {
		return "life";
	}
}
