package com.model1;

public class CustomerTest 
{
	public static void main(String[] args)
	{
		Customer c1=new Customer(101,"Rohit","9352625216","krohit30965@gmail.com","Password","HYD");
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getMobileNumber());
		System.out.println(c1.getEmail());
		System.out.println(c1.getPassword());
		System.out.println(c1.getAddress());
		
		System.out.println("----------------------------------------------");
		
		c1.setCustomerId(102);
		c1.setCustomerName("Amit");
		c1.setMobileNumber("9602780917");
		c1.setEmail("Amit343@gmail.com");
		c1.setPassword("12345678");
		c1.setAddress("Delhi");
		
		System.out.println("\n"+c1.getCustomerId());
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getMobileNumber());
		System.out.println(c1.getEmail());
		System.out.println(c1.getPassword());
		System.out.println(c1.getAddress());
		
		System.out.println("----------------------------------------------\n");
		
		c1.displayCustomerDetails();
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setCustomerName("");
		System.out.println(c1.getCustomerName());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setEmail("Krohit30965gmail.com");
		System.out.println(c1.getEmail());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setMobileNumber("960278091");
		System.out.println(c1.getMobileNumber());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setMobileNumber("12wb4hf7n3");
		System.out.println(c1.getMobileNumber());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setMobileNumber("qwertyuiop");
		System.out.println(c1.getMobileNumber());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setMobileNumber("1234567890");
		System.out.println(c1.getMobileNumber());
		
		System.out.println("\n--- Address Validation ---");

		c1.setAddress("");
		System.out.println(c1.getAddress());

		c1.setAddress("   ");
		System.out.println(c1.getAddress());

		c1.setAddress("Hyderabad");
		System.out.println(c1.getAddress());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setPassword("123456");
		System.out.println(c1.getPassword());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setPassword("qwertyui");
		System.out.println(c1.getPassword());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setPassword("12345678");
		System.out.println(c1.getPassword());
		
		c1.setPassword("123456");
		System.out.println(c1.getPassword());

		c1.setPassword("Rohit@123");
		System.out.println(c1.getPassword());

		c1.setPassword("123456789");
		System.out.println(c1.getPassword());
		

		System.out.println("--- Email Validation ---");

		c1.setEmail("rohit@gmail.com");
		System.out.println(c1.getEmail());

		c1.setEmail("rohit.gmail.com");
		System.out.println(c1.getEmail());

		c1.setEmail("rohit@");
		System.out.println(c1.getEmail());

		c1.setEmail("amit@example.in");
		System.out.println(c1.getEmail());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setCustomerId(102);
		System.out.println(c1.getCustomerId());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setCustomerId(0);
		System.out.println(c1.getCustomerId());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setCustomerId(-5);
		System.out.println(c1.getCustomerId());
		
		System.out.println("-----------------------------------------------\n");
		
		c1.setCustomerId(5);
		System.out.println(c1.getCustomerId());
		
		System.out.println("-------------------------------------------------\n");
		
		c1.displayCustomerDetails();
		

		System.out.println("\n--- Constructor Validation Test ---");

		Customer c2 = new Customer(
				103,
				"Rahul",
				"9876543210",
				"rahul@gmail.com",
				"Rahul@123",
				"Hyderabad"
				);

		c2.displayCustomerDetails();

		System.out.println("\n--- Invalid Constructor Test ---");

		Customer c3 = new Customer(
				0,
				"",
				"12ab456789",
				"rahulgmail.com",
				"123456",
				"   "
				);

		c3.displayCustomerDetails();
		
		System.out.println("------------------------------------------------\n");
		
		System.out.println("--------------- Default Constructo Test --------------");
		Customer c4=new Customer();
		c4.displayCustomerDetails();


	}

}
