package customerDecorator;

import insuranceFactory.Insurance;

public class RegularCustomer implements Customer{
	
	private CustomerData data;
	
	public RegularCustomer(CustomerData data) {
		this.data = data;
	}
	
	@Override
	public String whoAmI() {
		return "RegularCustomer";
	}

	@Override
	public CustomerData getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public double getTotalPrice() {
		int totalPrice = 0;
		for (Insurance insurance : data.getInsurances()) {
			totalPrice += insurance.getData().getPrice();
		}
		return totalPrice;
	}
}
