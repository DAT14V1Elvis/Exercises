package application;

public class Customer
{
	private String name;
	private String lastName;
	private String phone;
	private String mail;
	
	public Customer(String name, String lastName, String phone, String mail)
	{
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.mail = mail;
	}

	public String getName()
	{
		return name;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getMail()
	{
		return mail;
	}

	
}
