package org.fer.angularjs.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = -6617125269871808441L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FileOutputStream fos = null;
		try {  
            InputStream in = req.getInputStream();  
  
            System.out.println("Receiving file " +req.getHeader("fileName") + "for message " + req.getHeader("id"));
            fos = new FileOutputStream("/tmp/" + req.getHeader("fileName"));  
  
            byte[] buffer = new byte[4096];  
            int bytesRead;  
  
            try{  
            while((bytesRead = in.read(buffer)) != -1)  
                fos.write(buffer, 0, bytesRead);  
            }finally{  
                if(in != null)  
                    in.close();  
            }  
        }  
        catch(Exception ex)  
        {  
            ex.printStackTrace();  
        } finally {
        	if (fos!=null) {
        		fos.close();
        	}
        }
	
	}
	
}
