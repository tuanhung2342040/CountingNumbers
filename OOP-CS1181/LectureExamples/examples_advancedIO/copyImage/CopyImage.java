import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import java.util.Vector.*;


public class CopyImage{
	public static void main(String[] args)throws IOException{
		
		 FileInputStream  fs=null; 
	     FileOutputStream fd=null; 
		try{
			 fs= new FileInputStream("cat.jpg"); 
	         fd = new FileOutputStream("my_cat.jpg"); 
	         byte[] buf = new byte[1024];
	         int len = fs.read( buf);
	         while( len != -1){
	            // System.out.println(len);
	             fd.write(buf, 0, len);
	             len = fs.read( buf);
	         }
	     }finally{        
		 	fs.close();
		 	fd.close(); 
		 }	
		
	}
	
	
}	
