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
 * Servlet implementation class DelUser
 */
@WebServlet("/user/deluser")
public class DelUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		User user = new User();
		user.setId(id);
		boolean flag = new UserService().delUser(user);
		if(!flag) 
		{
			request.getSession().setAttribute("msg", "删除失败");
			request.getRequestDispatcher("/usermanager/usermanager.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("msg", "删除成功");
			request.getRequestDispatcher("/usermanager/show").forward(request, response);
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
