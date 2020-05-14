package app.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calculator", urlPatterns = "/calculator")
public class Calculator extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		float op1 = Float.parseFloat(req.getParameter("op1"));
		float op2 = Float.parseFloat(req.getParameter("op2"));
		float result = 0;
		String operator = req.getParameter("operator");
		String message="Calculate Susscess!";
		try {

			switch (operator) {
			case "+":
				result = op1 + op2;
				break;
			case "-":
				result = op1 - op2;
				break;
			case "*":
				result = op1 * op2;
				break;
			case "/":
				if(op2!=0) {
					result = op1 / op2;
					return;
				}
				else throw new RuntimeException("Can not devide by Zero");
				
			}
		} catch (Exception ex) {
			message = ex.getMessage();
		}
		req.setAttribute("op1", op1);
		req.setAttribute("op2", op2);
		req.setAttribute("result", result);
		req.setAttribute("operator", operator);
		req.setAttribute("message", message);
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req, resp);
	}

}
