package com.chainsys.io.charStreams;

import java.io. BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;
public class ReadLine {
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader (System.in); 
BufferedReader br=new BufferedReader (isr);
String str;
System.out.println("Enter lines of Text: ");
System.out.println("Enter 'stop' to quit: ");
do {
str=br.readLine();
System.out.println (str); } while (!str.equals("stop"));
}

}
