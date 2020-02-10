
public class Bike extends Vehicle{
	void speed()
	{  
		System.out.println("Speed limit is 60 km/hr.."); 
	}  
	void display()
	{
		
		System.out.println("Displaying Bike");
		
	}
	
	public static void main(String args[])
	{
		Vehicle obj = new Bike(); 
		obj.speed();  

	} 
	
}

