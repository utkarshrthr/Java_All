package com.core.concepts;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test
{
    public static void main(String args[])
    {
        FileOutputStream out = null;
        try 
        {
            out = new FileOutputStream("output.out");
            out.write(125486);
        }
        catch(IOException io) 
        {
            System.out.println("Error");
        }
        finally 
        {
            //out.close();
        }
    }
}