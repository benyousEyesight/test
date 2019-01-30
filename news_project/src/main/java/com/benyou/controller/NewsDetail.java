package com.benyou.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benyou.model.News;
import com.benyou.model.User;
import com.benyou.service.NewsService;
import com.benyou.service.UserService;

/**
 * Servlet implementation class NewsDetail
 */
@WebServlet("/show_detail")
public class NewsDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		News news = new News();
		news.setId(id);
		News dbnews = new NewsService().getNews(news);
		String author = dbnews.getAuthor();
		User user = new User();
		user.setId(author);
		User auser = new UserService().getAuser(user);
		request.getSession().setAttribute("news_detail", dbnews);
		request.getSession().setAttribute("news_user", auser);
		response.sendRedirect(request.getContextPath()+"/news/detail_news.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
