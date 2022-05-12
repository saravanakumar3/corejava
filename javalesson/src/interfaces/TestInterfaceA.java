package interfaces;

	public class TestInterfaceA {
		public static void main(String[] args) 
		{
			InterfaceA.echo();
			InterfaceA a1=new InterfaceCImpl();
		//	InterfaceA a1=new ExpliciteImplementor();
			a1.print();
			a1.print("Hello");
			
		
}}
