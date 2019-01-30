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
 * Servlet implementation class SaveUpdateUser
 */
@WebServlet("/usermanager/saveUser")
public class SaveUpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveUpdateUser() {
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
		boolean flag = new UserService().updateUser(user);
		if(!flag)
		{
			request.setAttribute("msg", "修改失败");
			request.getRequestDispatcher("usermanager/updateuser.jsp").forward(request, response);
		}else
		{
			request.getSession().setAttribute("msg", "修改成功");
			request.getRequestDispatcher("/user/show").forward(request, response);
			
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
