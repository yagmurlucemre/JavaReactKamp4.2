package interfaceAbstractDemo.concretes;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer))
		{
			super.save(customer);
		}
		else
		{
			System.out.println("Not a valid person");
		}
		
		
	}



}
