package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CalculateGrossSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeName = request.getParameter("employeeName");
        double basicSalary = Double.parseDouble(request.getParameter("basicSalary"));
        int otHours = Integer.parseInt(request.getParameter("otHours"));
        
        
        double grossSalary = basicSalary + (otHours * 1500.00);
        
        
        request.setAttribute("employeeName", employeeName);
        request.setAttribute("grossSalary", grossSalary);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/CalculateTaxServlet");
        dispatcher.forward(request, response);
    }
   }



