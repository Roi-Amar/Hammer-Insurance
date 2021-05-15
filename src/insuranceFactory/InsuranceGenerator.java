package insuranceFactory;

public abstract class InsuranceGenerator{	
	public abstract InsuranceType createInsurance();
	public void planInsurance() {
		InsuranceType i = createInsurance();
		i.insure();
	}
}
