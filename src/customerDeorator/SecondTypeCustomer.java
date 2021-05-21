package customerDeorator;

public class SecondTypeCustomer implements Customer{
	@Override
	public String whoAmI() {
		return "Second";
	}

	@Override
	public CustomerData getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
