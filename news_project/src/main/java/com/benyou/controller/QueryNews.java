package com.benyou.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.benyou.model.News;
import com.benyou.service.NewsService;

/**
 * Servlet implementation class QueryNews
 */
@WebServlet("/news/queryNews")
public class QueryNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryNews() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("param");
		News news = new News();
		news.setId(param);
		news.setAuthor(param);
		news.setContent(param);
		news.setCreatetime(param);
		news.setDescription(param);
		news.setType(param);
		news.setTitle(param);
		List<News> newsList = new NewsService().queryLike(news);
		request.getSession().setAttribute("newsList", newsList);
		response.sendRedirect(request.getContextPath()+"/news/queryNews.jsp");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
