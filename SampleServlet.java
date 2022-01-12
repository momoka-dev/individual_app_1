package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at:").append(request.getContextPath());
		response.setContentType("text/html; charset=UTF-8");
		//整数定義
		int num1 = 0; int num2 = 0;
		int sum = 0;
		Sample01 sp01 = new Sample01();
		sp01.execute();

		try {
			num1 = Integer.parseInt(request.getParameter("num1"));
			num2 = Integer.parseInt(request.getParameter("num2"));
			sum = num1 + num2;
		}catch(NumberFormatException nfe) {
			System.out.println("数字を入力してください。");
		}

		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("sum", sum);

		request.getRequestDispatcher("FormSample.jsp").forward(request, response);

	}

}
