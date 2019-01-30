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
 * Servlet implementation class AddUser
 */
@WebServlet("/usermanager/adduser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
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
		user.setId(id);
		user.setPassword(password);
		user.setUsername(username);
		user.setAuth(auth);
		boolean flag = new UserService().addUser(user);
		if(!flag) {
			request.setAttribute("msg", "添加用户失败");
			request.getRequestDispatcher("/usermanager/adduser.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "添加成功");
			request.getRequestDispatcher("/usermanager/adduser.jsp").forward(request, response);
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
