package com.benyou.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benyou.model.News;
import com.benyou.service.NewsService;

/**
 * Servlet implementation class AddNews
 */
@WebServlet("/addNews")
public class AddNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNews() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("news_id");
		String title = request.getParameter("title");
		String createtime = request.getParameter("createtime");
		String content = request.getParameter("content");
		String type = request.getParameter("type");
		String author = request.getParameter("author");
		String description = request.getParameter("description");
		
		News news = new News();
		news.setAuthor(author);
		news.setContent(content);
		news.setCreatetime(createtime);
		news.setId(id);
		news.setTitle(title);
		news.setType(type);
		news.setDescription(description);
		//add service
		boolean flag = new NewsService().addNews(news);
		if(!flag) {
			request.getSession().setAttribute("addNews", "添加新闻失败,请重新添加");
			response.sendRedirect(request.getContextPath()+"/news/addNews.jsp");
//			request.getRequestDispatcher("/news/addNews.jsp").forward(request, response);
		}else
		{
			request.setAttribute("addNews", "添加新闻成功");
			response.sendRedirect(request.getContextPath()+"/news/addNews.jsp");
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
