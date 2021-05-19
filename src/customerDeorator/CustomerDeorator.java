package customerDeorator;

public abstract class CustomerDeorator implements Customer{
	private Customer decorated;

	public CustomerDeorator(Customer decorated) {
		setDecoratedShape(decorated);
	}
	
	@Override
	public String whoAmI() {
		return decorated.whoAmI();
	}
	
	public Customer getDecoratedShape() {
		return decorated;
	}

	public void setDecoratedShape(Customer decoratedShape) {
		this.decorated = decoratedShape;
	}
}
