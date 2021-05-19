package customerDeorator;

public class DecoratorExampleMain {
	public static void main(String[] args) {
		Customer regular = new RegularCustomer();
		System.out.println(regular.whoAmI());
		
		Customer corporateRegular = new CorporateDecorator(regular);
		System.out.println(corporateRegular.whoAmI());
		
		Customer secondType = new SecondTypeCustomer();
		System.out.println(secondType.whoAmI());
		
		Customer VIPsecondType = new VIPDecorator(secondType);
		System.out.println(VIPsecondType.whoAmI());
		
		Customer corporateVIPsecondType = new CorporateDecorator(VIPsecondType);
		System.out.println(corporateVIPsecondType.whoAmI());
	}
}
