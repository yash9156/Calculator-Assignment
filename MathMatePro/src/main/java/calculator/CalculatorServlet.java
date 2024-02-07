package calculator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	        String operation = request.getParameter("operation");
	        double num1 = Double.parseDouble(request.getParameter("num1"));
	        double num2 = Double.parseDouble(request.getParameter("num2"));
	        double result = 0;

	        switch (operation) {
	            case "add":
	                result = num1 + num2;
	                break;
	            case "subtract":
	                result = num1 - num2;
	                break;
	            case "multiply":
	                result = num1 * num2;
	                break;
	            case "divide":
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    response.getWriter().println("Cannot divide by zero!");
	                    return;
	                }
	                break;
	            case "modulus":
	                if (num2 != 0) {
	                    result = num1 % num2;
	                } else {
	                    response.getWriter().println("Cannot calculate modulus with zero!");
	                    return;
	                }
	                break;
	            case "square":
	                result = num1 * num1;
	                break;
	            case "sqrt":
	                if (num1 >= 0) {
	                    result = Math.sqrt(num1);
	                } else {
	                    response.getWriter().println("Cannot calculate square root of a negative number!");
	                    return;
	                }
	                break;
	            default:
	                response.getWriter().println("Invalid operation!");
	                return;
	        }

	        response.getWriter().println("Result: " + result);
		}
	}