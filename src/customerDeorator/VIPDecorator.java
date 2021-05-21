package customerDeorator;

public class VIPDecorator extends CustomerDeorator{
	public VIPDecorator(Customer decorated) {
		super(decorated);
	}
	
	@Override
	public String whoAmI() {
		return "VIP " + getDecoratedShape().whoAmI();
	}

	@Override
	public double getTotalPrice() {
		int insurancesPrice = super.getDecoratedShape().getData().totalInsurancePrice();
		return insurancesPrice*0.9;
	}

}
