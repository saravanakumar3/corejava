package com.chainsys.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileOperations {
	public static void createfile() throws IOException {
	
	String dir = "D:\\Java Training SW\\temp\\FileOperation";
	
	File temp =new File(dir);
	if (temp.createNewFile()) {
		System.out.println( " File is  created : "  +temp.getName());
		}}
	public static void readfile() {
		// read data from new file
		
	         FileReader fr = null;
	         
	        try {
	            fr = new FileReader("D:\\Java Training SW\\temp\\FileOperation");
	            System.out.println("File is found!!");
	            
	        } 
	        catch (FileNotFoundException e) {
	            
	            System.out.println("File is not found!!");
	            e.printStackTrace();
	        }
	        
	        int i;
	        try {
	            while ((i = fr.read()) != -1)
	            System.out.print((char)i);
	            System.out.println("\n Data in file was readed successfully!!");
	        } catch (IOException e) {
	            System.out.println("Data not read!!");
	            e.printStackTrace();
	        }
	    }
	public static void addtest() {
		try {
			String dir = "D:\\Java Training SW\\temp\\FileOperation";
		 FileWriter fw = new FileWriter(dir, true);
	        String text ="Hello , text is added sucessfully";
         fw.write(text);
         System.out.println(" Text is added sucessfully");
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
			
	public static void moveFile()
    {
        
        String src = "D:\\Java Training SW\\temp\\FileOperation";
        String dest = "D:\\Java Training SW\\temp\\file.txt";
        Path tmp;
        try {
            tmp = Files.move(Paths.get(src), Paths.get(dest));
            if(tmp != null) 
            { 
                System.out.println("File successfully moved"); 
        } 
            }
        
        catch (IOException e) {
            System.out.println("Unable to move the file"); 
            e.printStackTrace();
        } 
  
       
  }		        
			        
				public static void renameFile()
			    {
			        
			         File oldfile = new File("D:\\Java Training SW\\temp\\FileOperation");
			         File newfile = new File("D:\\Java Training SW\\temp\\rename.txt");

			          if(oldfile.renameTo(newfile)) 
			          {
			             System.out.println("File name changed successfully");
			          } else 
			          {
			             System.out.println("Rename failed");
			          } 
			    }
			

			public static void modifyDataInFile() throws Exception
		    {
		        
		        FileOutputStream file = new FileOutputStream("D:\\Java Training SW\\temp\\FileOperation");
		        
		        String modify = "Data is modified!!!";
		        byte[] b = modify.getBytes();
		        file.write(b);
		        file.close();
		        System.out.println("Modification Complete");
		        
		        FileInputStream file1 = new FileInputStream("D:\\Java Training SW\\temp\\FileOperation");
		        int i;
		        while((i=file1.read())!=-1)
		        {
		        System.out.print((char)i);
		        }
		        file1.close();
		    }
			public static void deleteFile()
		    {
		         File file= new File("D:\\Java Training SW\\temp\\copyfile.txt");

		     if (file.delete()) {
		         System.out.println( "\n"+"  File deleted successfully");
		     }
		     else {
		         System.out.println("Failed to delete the file");
		     }
		    }
		    
		    
		    public static void copyFile()
		    {
		        
		        FileInputStream instream = null;
		        FileOutputStream outstream = null;
		        try{
		            File infile =new File("D:\\Java Training SW\\temp\\FileOperation");
		            File outfile =new File("D:\\Java Training SW\\temp\\copyfile.txt");
		 
		            instream = new FileInputStream(infile);
		            outstream = new FileOutputStream(outfile);
		 
		            byte[] buffer = new byte[1024];
		            int length;
		            
		            while ((length = instream.read(buffer)) > 0)
		            {
		                outstream.write(buffer, 0, length);
		            }
		            
		            instream.close();
		            outstream.close();
		            System.out.println("File copied successfully!!");
		            }
		        
		        catch(IOException ioe){
		            ioe.printStackTrace();
		         }
		    }
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		createfile();
		addtest();
		copyFile();
		renameFile();
		readfile();
		modifyDataInFile();
		
	
		deleteFile();
		
	
		
			}
	
	  

}






