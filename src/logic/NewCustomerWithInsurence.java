package logic;

import customerDecorator.CorporateDecorator;
import customerDecorator.Customer;
import customerDecorator.CustomerData;
import customerDecorator.CustomerDecorator;
import customerDecorator.RegularCustomer;
import customerDecorator.VIPDecorator;
import insuranceFactory.CarInsuranceGenerator;
import insuranceFactory.HealthInsuranceGenerator;
import insuranceFactory.HouseInsuranceGenerator;
import insuranceFactory.IncapacityToWorkInsuranceGenerator;
import insuranceFactory.Insurance;
import insuranceFactory.InsuranceGenerator;
import insuranceFactory.LifeInsuranceGenerator;

public class NewCustomerWithInsurence {
	Customer customer;
	
	public void setCostumerData(String ID, String firstName, String lastName, String email, String phone) {
		customer = new RegularCustomer(new CustomerData(ID, firstName, lastName, email, phone));
	}
	
	public void updateCostumerData(String ID, String firstName, String lastName, String email, String phone) {
		Customer internal;
		// need to find the innermost customer
		if (customer.whoAmI().contains("VIP") || customer.whoAmI().contains("corporate")) {
			internal = ((CustomerDecorator)customer).getDecoratedShape();
			// check if there's another level
			if (internal.whoAmI().contains("VIP") || internal.whoAmI().contains("corporate")) {
				internal = ((CustomerDecorator)internal).getDecoratedShape();
			}
		}
		else {
			internal = customer;
		}
		internal.getData().setID(ID);
		internal.getData().setFirstName(firstName);
		internal.getData().setLastName(lastName);
		internal.getData().setEmail(email);
		internal.getData().setPhone(phone);
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
	
	public void removeInsurance(String insurenceType) {
		for (Insurance i: customer.getData().getInsurances()) {
			if (i.getName() == insurenceType) {
				customer.getData().removeInsurance(i);
				return;
			}
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
	
	public void removeDecoration(String decorationType) {
		// check if the external decorator is the one we need to remove
		if (customer.whoAmI().startsWith(decorationType)) {
			customer = ((CustomerDecorator)customer).getDecoratedShape();
		}
		// if not, the decoration needed to remove is the internal one
		else {
			Customer internal = ((CustomerDecorator)customer).getDecoratedShape();
			if (internal != null && internal.whoAmI().startsWith(decorationType)) {
				internal = ((CustomerDecorator)internal).getDecoratedShape();
				if (internal != null) 
					((CustomerDecorator)customer).setDecoratedShape(internal);
			}
		}

	}
	
	public double getTotalPrice() {
		return customer.getTotalPrice();
	}

}
