package student;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDetails extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException{
				PrintWriter pw = res.getWriter();
				res.setContentType("text/html");
				
				String studentId = req.getParameter("sId");
				String password = req.getParameter("sPass");
			String name = "Jithin";
			int class1 =10;
			char sec ='E';
			
				
				if(studentId.equals("a101") && password.equals("password")) {
					pw.println("ID: " +studentId);
					pw.println("\nName: "+name);
					pw.println("\nClass: "+class1);
					pw.println("\nsec: "+sec);
				}
				else
					pw.println("Student does not exist....");
				pw.close();
			}
}
