package com.benyou.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benyou.model.User;
import com.benyou.service.UserService;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/login")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LogServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		User user = new User();
		user.setAccount(account);
		user.setPassword(password);
		System.out.println(user);
		User qUser = new UserService().getUser(user);
		System.out.println(qUser);
		if(qUser==null) 
		{
			request.setAttribute("ERROR", "用户名或密码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else 
		{
			request.getSession().setAttribute("user", qUser);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
			
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
