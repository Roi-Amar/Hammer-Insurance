package logic;

import customerDeorator.CorporateDecorator;
import customerDeorator.Customer;
import customerDeorator.CustomerData;
import customerDeorator.RegularCustomer;
import customerDeorator.VIPDecorator;
import insuranceFactory.CarInsuranceGenerator;
import insuranceFactory.HealthInsuranceGenerator;
import insuranceFactory.HouseInsuranceGenerator;
import insuranceFactory.IncapacityToWorkInsuranceGenerator;
import insuranceFactory.Insurance;
import insuranceFactory.InsuranceGenerator;
import insuranceFactory.LifeInsuranceGenerator;

public class NewCustomerWithInsurence {
	Customer customer;
	
	public void setCostumerData(String ID, String firstName, String lastName) {
		customer = new RegularCustomer(new CustomerData(ID, firstName, lastName));
	}
	
	public void addInsurance(String insurenceType) {
		InsuranceGenerator factory = null;
		
		switch(insurenceType) {
		case "house":
			factory = new HouseInsuranceGenerator();
			break;
		case "health":
			factory = new HealthInsuranceGenerator();
			break;
		case "car":
			factory = new CarInsuranceGenerator();
			break;
		case "life":
			factory = new LifeInsuranceGenerator();
			break;
		case "incapacity":
			factory = new IncapacityToWorkInsuranceGenerator();
			break;
		default:
			System.out.println("no such option\n");
		}
		
		if (factory!=null) {
			Insurance i = factory.planInsurance();
			customer.getData().addInsurance(i);
		} else {
			System.out.println("something went wrong");
		}
	}
	
	public void decorateCustomer(String decorationType) {
		switch (decorationType) {
		case "VIP":
			customer = new VIPDecorator(customer);
		break;
		case "corporate":
			customer = new CorporateDecorator(customer);
		break;
		default:
			System.out.println("No such option");
		}
	}
	
	public double getTotalPrice() {
		return customer.getTotalPrice();
	}

}
