import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// user details and display
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		String mobile = request.getParameter("mobile");

		HttpSession ses = request.getSession();
		String email = (String) ses.getAttribute("email");

		if (fname.trim().isEmpty() || lname.trim().isEmpty() || age.trim().isEmpty() || mobile.trim().isEmpty()) {
			PrintWriter out = response.getWriter();
			out.println("<h2>Fields should not be empty</h2>");
			request.getRequestDispatcher("/UserReg.html").include(request, response);
		}

		else {

			ses.setAttribute("fname", fname);
			ses.setAttribute("lname", lname);
			ses.setAttribute("age", age);
			ses.setAttribute("mobile", mobile);

			LoginProcess.addData(email, fname, lname, age, mobile);
			response.sendRedirect("jsp/user_details.jsp");
		}

	}

}
