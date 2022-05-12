/**
 * 
 */
package com.chainsys.io.byteStreams;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
public class BufferInputDemo {

    public static void main(String arg[], byte[] buf)
    {
        
    String s="99% is &approx equal to 100 but this is approx; not equal to 95";
    byte but[]=s.getBytes();
    ByteArrayInputStream in=new ByteArrayInputStream (buf);
    BufferedInputStream f=new BufferedInputStream (in);
    int c = 0;
    try
    {
    while ((c-f.read()) !=-1)
    {
        
    System.out.print ((char) c);

    }
    } catch (IOException ex)
    {
    ex.printStackTrace();
    }
    }
    }
