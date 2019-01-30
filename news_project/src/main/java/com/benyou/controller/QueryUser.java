package com.benyou.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benyou.model.User;
import com.benyou.service.UserService;

/**
 * Servlet implementation class QueryUser
 */
@WebServlet("/usermanager/queryuser")
public class QueryUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String auth = request.getParameter("auth");
		
		User user = new User();
		user.setAccount(account);
		user.setAuth(auth);
		user.setId(id);
		user.setPassword(password);
		user.setUsername(username);
		
//		需要一个方法，获取返回的List<User>
		List<User> quserList = new UserService().getUserList(user);
		request.setAttribute("quserlist", quserList);
		request.getRequestDispatcher("queryUser.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
