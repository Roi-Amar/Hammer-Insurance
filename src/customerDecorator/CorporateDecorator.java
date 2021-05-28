package customerDecorator;

public class CorporateDecorator extends CustomerDecorator{
	public CorporateDecorator(Customer decorated) {
		super(decorated);
	}
	
	@Override
	public String whoAmI() {
		return "corporate " + getDecoratedShape().whoAmI();
	}

	@Override
	public double getTotalPrice() {
		double insurancesPrice = super.getDecoratedShape().getTotalPrice();
		return insurancesPrice*0.88;
	}
}
