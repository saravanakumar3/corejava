package com.chainsys.strings;

public class StringBuilderDemo {
public static void testA()
{
	String firstString="Hello how are you today";
	StringBuilder stringbuilder =new StringBuilder();

	//stringBulider.ensurecapacity(250);
	System.out.println("length : "+ stringbuilder.length());
	System.out.println("capcity  : "+ stringbuilder.capacity());
	stringbuilder.append(firstString);
	System.out.println("buffer"+ stringbuilder);
	System.out.println("length : "+ stringbuilder.length());
	System.out.println("capcity  : "+ stringbuilder.capacity());
firstString="Wish it rain this week";
stringbuilder.append(firstString);
System.out.println("buffer"+ stringbuilder);
System.out.println("length : "+ stringbuilder.length());
System.out.println("capcity  : "+ stringbuilder.capacity());
// redue capacity to length
stringbuilder.trimToSize();
System.out.println("length : "+ stringbuilder.length());
System.out.println("capcity  : "+ stringbuilder.capacity());
stringbuilder.replace(3, 5, "This is a test");

System.out.println("Replace : "+ stringbuilder);
stringbuilder.insert(5, "This is a august");

System.out.println("insert : "+ stringbuilder);
System.out.println("length  : "+ stringbuilder.length());
System.out.println("capcity  : "+ stringbuilder.capacity());

stringbuilder.delete(5,10);

System.out.println("Delete : "+ stringbuilder);
System.out.println("\tlength  : "+ stringbuilder.length());
System.out.println("\tcapcity  : "+ stringbuilder.capacity());

}
}