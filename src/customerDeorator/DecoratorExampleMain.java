package customerDeorator;

public class DecoratorExampleMain {
	public static void main(String[] args) {
		Customer regular = new RegularCustomer(null);
		System.out.println(regular.whoAmI());
		
		Customer corporateRegular = new CorporateDecorator(regular);
		System.out.println(corporateRegular.whoAmI());
		
		Customer VIPsecondType = new VIPDecorator(regular);
		System.out.println(VIPsecondType.whoAmI());
		
		Customer corporateVIPsecondType = new CorporateDecorator(VIPsecondType);
		System.out.println(corporateVIPsecondType.whoAmI());
	}
}
