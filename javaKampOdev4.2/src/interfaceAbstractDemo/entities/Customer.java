package interfaceAbstractDemo.entities;

import interfaceAbstractDemo.abstracts.CustomerService;

public class Customer implements CustomerService {
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public long nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	

}
