package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.registerdao;
import dto.registerdto;

/**
 * Servlet implementation class registerConfirmServlet
 */
@WebServlet("/registerConfirmServlet")
public class registerConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object registerdto;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
		Login login= (Login)session.getAttribute("input_data");
		
		String name = request.getParameter("name");
		String writer = request.getParameter("writer");
		String pub = request.getParameter("pub");
		String isbnTenp = request.getParameter("isbn");
		String login_idTenp = request.getParameter("login_id");
		
		
		int isbn = Integer.parseInt(isbnTenp);
		int id = login.getId();
		registerdto book = new registerdto(name, writer, pub, isbn, id);
		
		// セッションスコープのインスタンス取得
	int result = registerdao.registerbook(book);
		
		if(result == 1) {
			String view = "WEB-INF/view/success3.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
	}else {
		String view = "WEB-INF/view/success1.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
