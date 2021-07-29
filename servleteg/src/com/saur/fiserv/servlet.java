package com.saur.fiserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet {
	

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{

		PrintWriter out=res.getWriter();
		out.println("<h1>hello world</h1>");
		
		System.out.println("in the do get metttttttthod");	
	}

   public void doPost(HttpServletRequest req,HttpServletResponse res)
   {
	   System.out.println("in the post metttttthod");
   }

}

