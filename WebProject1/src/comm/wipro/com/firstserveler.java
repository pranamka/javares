package comm.wipro.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstserveler
 */ 
public class firstserveler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 private String message;
	
    /**
     * Default constructor. 
     */
    public firstserveler() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
		 message = "Hello World";
		
	     // Set response content type
	     response.setContentType("text/html");

	     // Actual logic goes here.
	     PrintWriter out = response.getWriter();
	     out.println("<h1>" + message + "</h1>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
