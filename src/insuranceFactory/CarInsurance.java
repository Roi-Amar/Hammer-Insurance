package insuranceFactory;

public class CarInsurance implements InsuranceType{
	@Override
	public void insure() {
		System.out.println("CarInsurance");
	}
}
