package p1;

public class Mammal implements Animal {

		  public void eats() {       
			  System.out.println("Mammal eats");    
			  } 
		  public void travel() 
			  {
			  System.out.println("Mammal travels");  
			  
			  }   
		 
		  public int noOfLegs() {    
			  return 4;   
		  }
		  
		  public static void main(String args[]) { 
			  Mammal m = new Mammal();     
			  m.eats();   
			  m.travel();
		  System.out.println("I have " +m.noOfLegs() +" legs."); 
		  
		  }
		@Override
		public void t() {
			// TODO Auto-generated method stub
			
		}
		  

	}

