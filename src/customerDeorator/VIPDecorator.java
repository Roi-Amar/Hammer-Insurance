package customerDeorator;

public class VIPDecorator extends CustomerDeorator{
	public VIPDecorator(Customer decorated) {
		super(decorated);
	}
	
	@Override
	public String whoAmI() {
		return "VIP " + getDecoratedShape().whoAmI();
	}
}
