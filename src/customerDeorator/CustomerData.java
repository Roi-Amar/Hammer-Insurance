package customerDeorator;

import java.util.ArrayList;
import insuranceFactory.Insurance;

public class CustomerData {
	private String ID;
	private String firstName;
	private String lastName;
	private ArrayList<Insurance> Insurances = new ArrayList<Insurance>();
	
	public CustomerData(String ID, String firstName, String lastName) {
		setID(ID);
		setFirstName(firstName);
		setLastName(lastName);
	}

	
	public CustomerData(String ID, String firstName, String lastName, Insurance insurance) {
		setID(ID);
		setFirstName(firstName);
		setLastName(lastName);
		addInsurance(insurance);
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Insurance> getInsurances() {
		return Insurances;
	}

	public void setInsurances(ArrayList<Insurance> insurances) {
		Insurances = insurances;
	}
	
	public void addInsurance(Insurance insurance) {
		Insurances.add(insurance);
	}
	
	public void removeInsurance(Insurance insurance) {
		Insurances.remove(insurance);
	}
	
	
}
