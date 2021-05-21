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
		double insurancesPrice = super.getDecoratedShape().getTotalPrice();
		return insurancesPrice*0.9;
	}

}
