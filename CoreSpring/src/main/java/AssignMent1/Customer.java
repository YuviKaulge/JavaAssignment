package AssignMent1;

public class Customer 
{
	private int customerid;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
	public int getCustomerid() 
	{
		return customerid;
	}
	public void setCustomerid(int customerid) 
	{
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
		
	}
	public String getCustomerContact() 
	{
		return customerContact;
	}
	public void setCustomerContact(String customerContact)
	{
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress()
	{
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) 
	{
		this.customerAddress = customerAddress;
	}
	public Customer(int customerid, String customerName, String customerContact, Address customerAddress) 
	{
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	
	public Customer()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() 
	{
		return "Customer [customerid= " + customerid + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
	
	

}
