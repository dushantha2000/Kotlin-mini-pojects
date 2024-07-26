package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CalculateTaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeName = (String)request.getAttribute("employeeName");
        double grossSalary = (double)request.getAttribute("grossSalary");
        
        
        double taxRate = (grossSalary >= 100000.00) ? 0.1 : 0.05;
        double taxAmount = grossSalary * taxRate;
        
        
        double netSalary = grossSalary - taxAmount;
        
        
        request.setAttribute("employeeName", employeeName);
        request.setAttribute("grossSalary", grossSalary);
        request.setAttribute("taxAmount", taxAmount);
        request.setAttribute("netSalary", netSalary);
        
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/salary-summary.jsp");
        dispatcher.forward(request, response);
    }
}


