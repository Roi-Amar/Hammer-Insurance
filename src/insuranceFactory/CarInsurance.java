package insuranceFactory;

public class CarInsurance implements Insurance{
	private InsuranceData data;
	
	public CarInsurance() {
		data = new InsuranceData(400);
	}
	
	public void insure() {
		System.out.println("CarInsurance");
	}

	@Override
	public InsuranceData getData() {
		// TODO Auto-generated method stub
		return data;
	}
	
	public String getName() {
		return "car";
	}
}
