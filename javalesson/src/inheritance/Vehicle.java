package inheritance;

	public class Vehicle
	{
	  public String Regno;
	  
	  public Vehicle(String x)   
	  {
	  	  System.out.println("Vehicle Constructed "+this.hashCode());
	  }
	  
	  public void move()   
	  {
		  System.out.println("Vehicle.move");
	  }
	 }
	/*public class Car extends Vehicle
	{
		public Car()
		{
			super("TN 01 A 008");
		}
}*/
