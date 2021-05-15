package customerDeorator;

public abstract class CustomerDecorator implements Customer{
	   protected Customer decoratedCustomer;

	   public CustomerDecorator(Customer decoratedCustomer){
	      this.decoratedCustomer = decoratedCustomer;
	   }

	   public void exampleFunk(){
		   decoratedCustomer.exampleFunk();
	   }	
}
