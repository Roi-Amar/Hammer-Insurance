package customerDeorator;

public class CorporateDecorator extends CustomerDeorator{
	public CorporateDecorator(Customer decorated) {
		super(decorated);
	}
	
	@Override
	public String whoAmI() {
		return "Corporate " + getDecoratedShape().whoAmI();
	}
}
