package customerDeorator;

public class SecondTypeCustomer implements Customer{
	@Override
	public String whoAmI() {
		return "Second";
	}
}
