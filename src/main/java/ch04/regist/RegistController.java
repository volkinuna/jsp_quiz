package ch04.regist;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistController
 */
@WebServlet("/rcontrol")
public class RegistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RegistService service;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		service = new RegistService();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		String view = "";
		
		if(action == null) {
			getServletContext().getRequestDispatcher("/rcontrol?action=list").forward(req, resp);
		} else {
			switch (action) {
			case "list": view = List(req, resp); break;
			case "info": view = info(req, resp); break;
			}
			
			getServletContext().getRequestDispatcher("/ch04/regist/" + view).forward(req, resp);
		}
	}
       
	private String List(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("customerList", service.findAll());
		return "registList.jsp";
	}
	
	private String info(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		req.setAttribute("r", service.find(id));
		return "registInfo.jsp";
	}

}
