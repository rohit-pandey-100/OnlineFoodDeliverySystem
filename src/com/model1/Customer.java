package com.model1;

public class Customer
{
	private int customerId; //Instance Variable or Instance Identifire
	// The name of the variable is allways start with small letter the first letter must be a small letter or it called camelcase
	
	private String customerName; //Instance Variable or Instance Identifire
	private String mobileNumber; //Instance Variable or Instance Identifire
	private String email; //Instance Variable or Instance Identifire
	private String password; //Instance Variable or Instance Identifire
	private String address; //Instance Variable or Instance Identifire
	
	
	
	
	public Customer()
	{
		System.out.println("Default constructor called");
	}
	//Parameterized Constructor
	public Customer(int customerId, String customerName, String mobileNumber, String email, String password, String address)
	{
		/*
		this.customerId=customerId;
		this.customerName=customerName;
		this.mobileNumber=mobileNumber;
		this.email=email;
		this.password=password;
		this.address=address;
		*/
		
		this.setCustomerId(customerId);
		this.setCustomerName(customerName);
		this.setEmail(email);
		this.setMobileNumber(mobileNumber);
		this.setPassword(password);
		this.setAddress(address);
	}
	
	//Getter or setter method 
	public void setCustomerId(int customerId)
	{
		if(customerId>0)
		{
			this.customerId=customerId;
		}
		else
		{
			System.out.println("Customer ID must be positive");
		}
		//Setter method is used to update or changes the value
	}
	public int getCustomerId()
	{
		return customerId;
		//getter methodd is used to get or read the value
	}
	public void setCustomerName(String customerName)
	{
		if(customerName!= null && !customerName.trim().isEmpty())
		{
			this.customerName=customerName;
		}
		else
		{
			System.out.println("Customer name cannot be empty");
		}
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setMobileNumber(String mobileNumber)
	{
		/*if(mobileNumber.length()==10)
		{
			this.mobileNumber=mobileNumber;
		}
		*/
		if(mobileNumber!=null && mobileNumber.matches("[0-9]{10}"))
		{
			this.mobileNumber=mobileNumber;
		}
		else
		{
			System.out.println("Invalid mobile number");
		}
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	public void setEmail(String email)
	{
		if(email!=null && email.matches("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"))
		{
			this.email=email;
		}
		else
		{
			System.out.println("Invalid email address");
		}
	}
	public String getEmail()
	{
		return email;
	}
	public void setPassword(String password)
	{
		if(password!=null && password.trim().length()>=8)
		{
			this.password=password;
		}
		else
		{
			System.out.println("Password must contain at least 8 characters");
		}
	}
	public String getPassword()
	{
		return password;
	}
	public void setAddress(String address)
	{
		if(address!=null && !address.trim().isEmpty())
		{
			this.address=address;
		}
		else
		{
			System.out.println("Address cannot be empty");
		}
	}
	public String getAddress()
	{
		return address;
	}
	public void displayCustomerDetails()
	{
		System.out.println("---------------Customer Details---------------");
		System.out.println("CustomerId: "+customerId);
		System.out.println("CustomerName: "+customerName);
		System.out.println("MobileNumber: "+mobileNumber);
		System.out.println("Email: "+email);
		//System.out.println("Password: "+password);
		System.out.println("Address: "+address);
	}
}