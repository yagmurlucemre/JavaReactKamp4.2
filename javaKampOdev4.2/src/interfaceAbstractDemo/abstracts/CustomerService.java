package interfaceAbstractDemo.abstracts;

import java.rmi.RemoteException;

import interfaceAbstractDemo.entities.Customer;

public interface CustomerService {
	
	void save(Customer customer) throws RemoteException;

}
