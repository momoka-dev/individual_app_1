package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FuramingoServlet
 */
@WebServlet("/FuramingoServlet")
public class FuramingoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String addres = request.getParameter("addres");
		String message = request.getParameter("message");

		String nameresult = "名前が入力されています";
		String addresresult = "宛先が選択されています";
		String messageresult = "お便り内容が入力されています";

		String resultmessage = "";
		if(name == null || name.length() == 0) {
			nameresult = "名前が入力されていません";
		}
		if(addres == "unselected") {
			addresresult = "宛先が入力されていません";
		}
		if(message == null || message.length() == 0) {
			messageresult = "お便り内容が入力されていません";
		}
		if(nameresult == "名前が入力されています" && addresresult == "宛先が選択されています" && messageresult == "お便り内容が入力されています") {
			resultmessage = "お便りが送信されました！";
		}else {
			resultmessage = "お便りが送信されませんでした。入力を確認してください";
		}
		//html
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");

		out.println("<head>");
		out.println("<title>お便り送信結果</title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<p>" + resultmessage + "</p>");
		out.println("</body>");

		out.println("</html>");
	}
}
