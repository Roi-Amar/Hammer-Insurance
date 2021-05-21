package insuranceFactory;

public abstract class InsuranceGenerator{	
	public abstract Insurance createInsurance();
	public Insurance planInsurance() {
		Insurance i = createInsurance();
		i.insure();
		return i;
	}
}
