

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HobCalcServlet
 */
public class HobCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("user");
		String num=request.getParameter("number");
		String email=request.getParameter("mail");
		String address=request.getParameter("address");
		
		int totalScore=0;
		
		String running = request.getParameter("running");
		if (running!=null){
			totalScore=totalScore+10;
		}
		
		String swimming = request.getParameter("swimming");
		if (swimming!=null) {
			totalScore=totalScore+10;
		}
		
		String cycling=request.getParameter("cycling");
		if (cycling!=null) {
			totalScore=totalScore+10;
		}
		
		String football = request.getParameter("football");
		if (football!=null) {
			totalScore=totalScore+10;
		}
		
		String soccer = request.getParameter("soccer");
		if (soccer!=null) {
			totalScore=totalScore+10;
		}
		
		String rugby = request.getParameter("rugby");
		if (rugby!=null) {
			totalScore=totalScore+10;
		}
		
		String fitness = request.getParameter("fitness");
		
		if ("low".equals(fitness)) {
			totalScore=totalScore+10;

		}    
		
		else if ("average".equals(fitness)) {
			totalScore=totalScore+20;

		}    
		
		else if ("high".equals(fitness)) {
			totalScore=totalScore+30;

		}    
		
		String pop = request.getParameter("pop");
		if (pop!=null) {
			totalScore=totalScore+10;

		}
		
		 
		String classical = request.getParameter("classical");
		if (classical!=null) {
			totalScore=totalScore+10;
		}
		
		String country = request.getParameter("country");
		if (country!=null) {
			totalScore=totalScore+10;
		}
		
		String reading = request.getParameter("reading");
		
		
		if ("historicalFiction".equals(reading)) {
			totalScore=totalScore+10;
		
		} else if ("historicalNonFiction".equals(reading)) {
			totalScore=totalScore+20;
		
		} else if("crimeFiction".equals(reading)) {
			totalScore=totalScore+30;
		
		} else if ("romance".equals(reading)){
			totalScore=totalScore+10;
		
		} else if ("comedy".equals(reading)) {
			totalScore=totalScore+50;
		}
		
		
		response.getWriter().append(name + " your total score is " + totalScore + ".");
		
//		.append(request.getContextPath()) - if you want path listed after string
	}


}
