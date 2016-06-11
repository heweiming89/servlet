package cn.heweiming.servlet.controller;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommonServlet
 */
@WebServlet(urlPatterns = { "/common" })
public class CommonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CommonServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.getGraphics();
		// graphics.setColor(Color.RED);
		graphics.drawString("你好", 20, 20);
		ImageIO.write(image, "jpg", response.getOutputStream());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void test() {
		try {
			Context ctx = new InitialContext();
			ctx.lookup("java:comp/env/jdbc/dstest");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
