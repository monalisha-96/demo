package library;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String button=request.getParameter("submit");
		if(button.equalsIgnoreCase("signUp"))
		{
			Data obj=new Data(request.getParameter("name"),request.getParameter("email"),request.getParameter("password"),request.getParameter("mobile"));
		    int i=Dao.insert(obj);
		    if(i>0)
		    {
		    	RequestDispatcher rd=request.getRequestDispatcher("SignIn.jsp");
		    	rd.forward(request, response);
		    }
		}
		else if(button.equals("signIn"))
		{
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			Data obj=Dao.validate(email,password);
			if(obj!=null)
			{
				request.setAttribute("lib", obj);
				RequestDispatcher rd=request.getRequestDispatcher("library.jsp");
		    	rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("SignIn.jsp");
		    	rd.forward(request, response);
			}
		}
		else if(button.equals("addBook"))
		{
			Book obj=new Book(request.getParameter("name"),request.getParameter("author"),request.getParameter("callno"));
			int i=Dao.insertBook(obj);
			if(i>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("library.jsp");
		    	rd.forward(request, response);
			}
		}
	}

}
