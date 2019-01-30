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
 * Servlet implementation class SaveUpdateNews
 */
@WebServlet("/saveUpdateNews")
public class SaveUpdateNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveUpdateNews() {
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
		news.setId(id);
		news.setTitle(title);
		news.setCreatetime(createtime);
		news.setAuthor(author);
		news.setContent(content);
		news.setType(type);
		news.setDescription(description);
		//need a method to update the news
		boolean flag = new NewsService().updateNews(news);
		if(!flag) 
		{
			request.setAttribute("msg", "修改新闻信息失败");
			request.getRequestDispatcher("main.jsp").forward(request, response);
//			request.getSession().setAttribute("updateFail", "修改新闻信息失败");
//			response.sendRedirect( request.getContextPath()+"/main.jsp");
		}else 
		{
			request.setAttribute("msg", "修改新闻信息成功");
			request.getRequestDispatcher("newsManager").forward(request, response);
			
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
