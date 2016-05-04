package cn.heweiming.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.heweiming.servlet.domain.User;

/**
 * Servlet implementation class CommonServlet
 */
@WebServlet(urlPatterns = { "/common" })
public class CommonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CommonServlet() {
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setUsername("张三");
		user.setPassword("张三的密码");
		request.setAttribute("user", user);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
