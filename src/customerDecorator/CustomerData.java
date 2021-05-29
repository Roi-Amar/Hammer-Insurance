package customerDecorator;

import java.util.ArrayList;
import insuranceFactory.Insurance;

public class CustomerData {
	private String ID;
	private String firstName;
	private String lastName;
	private ArrayList<Insurance> Insurances = new ArrayList<Insurance>();
	private String email;
	private String phone;
	private String typeString;
	private String InsurancesAsString;
	private String priceString;
	
	public CustomerData(String ID, String firstName, String lastName, String email, String phone) {
		setID(ID);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhone(phone);
	}

	
	public CustomerData(String ID, String firstName, String lastName, Insurance insurance,  String email, String phone) {
		setID(ID);
		setFirstName(firstName);
		setLastName(lastName);
		addInsurance(insurance);
		setEmail(email);
		setPhone(phone);
	}
	
	public CustomerData(String[] rowdata) {
		setFirstName(rowdata[0]);
		setLastName(rowdata[1]);
		setID(rowdata[2]);
		setEmail(rowdata[3]);
		setPhone(rowdata[4]);
		setInsurancesAsString(rowdata[5]);
		setTypeString(rowdata[6]);
		setPriceString(rowdata[7]);
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getInsurancesAsString() {
		return InsurancesAsString;
	}


	public void setInsurancesAsString(String insurancesAsString) {
		InsurancesAsString = insurancesAsString;
	}


	public String getPriceString() {
		return priceString;
	}


	public void setPriceString(String priceString) {
		this.priceString = priceString;
	}
	
	public String getTypeString() {
		return typeString;
	}

	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
}
