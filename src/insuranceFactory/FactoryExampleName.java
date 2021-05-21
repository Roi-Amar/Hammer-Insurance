package insuranceFactory;

public class FactoryExampleName {
	public static void main(String[] args) {
		//choose delivery parameters
		//String type = "abroad";
		String type = "house";
		InsuranceGenerator factory = null;
		String price = null;
		
		//get the logistics we need from the factory
		switch(type) {
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
			System.out.println("no such option\nplease choose domestic or abroad shipping type");
		}
		
		if (factory!=null) {
			price = setPrice(type);
			Insurance i = factory.planInsurance();
			InsuranceData data = i.getData();
			String insureType = i.getClass().getName();
			int totalCost = i.getData().getPrice();
			String expired = i.getData().getExpireTimeString();
			String aquierd = i.getData().getAquireTimeString();
			System.out.println("type:" + insureType + "\n" +
					"total cost:" + totalCost + "\n" +
					"expired date:" + expired + "\n" + 
					"aquierd date:" + aquierd);
		} else {
			System.out.println("something went wrong");
		}
	}

	private static String setPrice(String type) {
		switch(type) {
		case "house":
			return "100";
		case "health":
			return "200";
		case "car":
			return "150";
		case "life":
			return "300";
		case "incapacity":
			return "500";
		default:
			System.out.println("no such option\nplease choose domestic or abroad shipping type");
		}		return null;
	}
}
