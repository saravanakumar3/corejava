package com.syschain.reflectionsactor;

public class Actor {
	
		public  String Name;
		String city;
		protected  long pincode;
		public String City;
		
		public Actor()
		{
			Name="default";
		}
		public Actor(String value)
		{
			Name=value;
		}
		
	  public void printName()
	  {
	  	System.out.println("\t printName "+Name);
	  }
	  public int getName(int x,int y,int z)
	  {
		 System.out.println("\t getName "+Name);
		 return x+y+z;
	  }
	  protected void printCity()
	  {
		 System.out.println(" printCity "+city);
	  }
	 private void printPincode()
	  {
		 System.out.println(" printPincode "+pincode);
	  }
	// emp
	 public class Emp
	 {
	    public int Eno;
	    public String Name;
	    public Emp()
	    {
	       System.out.println("Emp Created");
	    }
	    public void startWork()
	    {
	       System.out.println("WorkStarted");
	 	}
	 	public void pauseWork(int duration)
	 	{
	 		System.out.println("pauseWork for "+duration );
	 	}
	 }
}

