package insuranceFactory;

public abstract class InsuranceGenerator{	
	public abstract Insurance createInsurance(String price);
	public Insurance planInsurance(String price) {
		Insurance i = createInsurance(price);
		i.insure();
		return i;
	}
}
