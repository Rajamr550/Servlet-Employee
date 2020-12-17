import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out = response.getWriter();

	public static HashMap<String, String> map = new HashMap<String, String>();
	public static HashMap<String, String> finame = new HashMap<String, String>();
	public static HashMap<String, String> laname = new HashMap<String, String>();
	public static HashMap<String, String> agemap = new HashMap<String, String>();

	public static HashMap<String, String> mobilemap = new HashMap<String, String>();

	public LoginProcess() {
		map.put("admin@123", "admin");
		map.put("r@r", "r");
		map.put("a@a", "a");
		map.put("", "");
		map.put("raja@gmail", "raja1234");

	}

	public boolean checkKey(String key) {
		if (map.containsKey(key))
			return true;
		return false;
	}

	public static void addData(String email, String fname, String lname, String age, String mobile) {

		finame.put(email, fname);
		laname.put(email, lname);
		agemap.put(email, age);
		mobilemap.put(email, mobile);

	}

	public static void showDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("employee list ");
		out.print("<html><head><style='text/css'>{body{background-color:black;}</style></head>");
		int i = 1;

		for (Entry<String, String> mapElement : map.entrySet()) {
			out.println(" <br>");
			out.println(i + "." + mapElement.getKey());
			out.println(" ");
			i++;

		}
		out.print("<a href='addemployee.html'>1.Add New Employee</a>"); // relative if on same level as servlet
		out.print("<a href='/WebApplication1/addemployee.html'>1.Add New Employee</a>"); // absolute - hardcoded context
		// out.print("<a href='" + getServletContext().getContextPath() +
		// "/addemployee.html'>1.Add New Employee</a>"); // absolute - context read from
		// configuratio
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/EmpList");
		rd.forward(request, response);
		// out.print("<a href="/jsp/EmpList">EmpList</a>");
//		response.sendRedirect("/jsp/EmpList");
	}

	public static void addReg(String email, String pass, String fname, String lname, String age, String mobile) {
		map.put(email, pass);
		finame.put(email, fname);
		laname.put(email, lname);
		agemap.put(email, age);
		mobilemap.put(email, mobile);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String choice = request.getParameter("choice");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String fname = "Leo";
		String lname = "Mark";
		String age = "12";
		String mobile = "88";

		PrintWriter out = response.getWriter();

		if (Integer.valueOf(choice) == 0) {

			if (checkKey(email)) {

				// admin check
				if (email == "admin@123" && map.get(email) == "admin") {
					RequestDispatcher rd = request.getRequestDispatcher("/achoice.html");
					rd.forward(request, response);

				}

				else if (map.get(email).equals(pass)) {
					out.print("valid data and Password");
					HttpSession ses = request.getSession();
					ses.setMaxInactiveInterval(-1);
					ses.setAttribute("email", email);
					RequestDispatcher rd = request.getRequestDispatcher("/UserReg.html");
					rd.forward(request, response);

				}

				else
					out.print("invalid password");

			}

			else {
				out.print("invalid username");
			}

		}

		else if (Integer.valueOf(choice) == 4) {
			// showDetails(request, response);
			out.print("<a href='addemployee.html'>1.Add New Employee</a>"); // relative if on same level as servlet
			out.print("<a href='/WebApplication1/addemployee.html'>1.Add New Employee</a>");

		}
	}
}
