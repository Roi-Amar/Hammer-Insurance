package customerDeorator;

public class RegularCustomer implements Customer{
	@Override
	public String whoAmI() {
		return "RegularCustomer";
	}
}
