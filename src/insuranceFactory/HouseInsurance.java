package insuranceFactory;

public class HouseInsurance implements InsuranceType{
	@Override
	public void insure() {
		System.out.println("HouseInsurance");
	}
}
