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
 * Servlet implementation class UserManager
 */
@WebServlet("/usermanager/show")
public class UserManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> list = new UserService().getAll();
		for (User user : list) {
			if(user.getAuth()==null)
			{
				user.setAuth("");
			}
			else if(user.getAuth().equals("0")) 
			{
				user.setAuth("体育");
			}
			else if(user.getAuth().equals("1")) 
			{
				user.setAuth("娱乐");
			}
			else if(user.getAuth().equals("2")) 
			{
				user.setAuth("时政");
			}
			else if(user.getAuth().equals("3")) 
			{
				user.setAuth("国际");
			}
			else if(user.getAuth().equals("4")) 
			{
				user.setAuth("民生");
			}
			else if(user.getAuth().equals("5")) 
			{
				user.setAuth("NBA");
			}else if(user.getAuth().equals("6"))
			{
				user.setAuth("生活");
			}else 
			{
				user.setAuth("admin");
			}
			
		}
		request.getSession().setAttribute("userlist", list);
		response.sendRedirect(request.getContextPath()+"/usermanager/usermanager.jsp");
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
