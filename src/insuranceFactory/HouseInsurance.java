package insuranceFactory;

public class HouseInsurance implements Insurance{
	private InsuranceData data;
	
	public HouseInsurance() {
		data = new InsuranceData(300);
	}
	
	@Override
	public void insure() {
		System.out.println("HouseInsurance");
	}
	@Override
	public InsuranceData getData() {
		// TODO Auto-generated method stub
		return data;
	}
}
