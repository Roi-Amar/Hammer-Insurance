package customerDecorator;

public abstract class CustomerDecorator implements Customer{
	private Customer decorated;

	public CustomerDecorator(Customer decorated) {
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
	
	public abstract double getTotalPrice();
	
	public CustomerData getData() {
		// TODO Auto-generated method stub
		return decorated.getData();
	}
}
