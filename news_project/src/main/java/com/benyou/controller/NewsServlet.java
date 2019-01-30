package com.benyou.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benyou.model.News;
import com.benyou.model.Page;
import com.benyou.service.NewsService;
import com.benyou.service.PageService;

/**
 * Servlet implementation class NewsServlet
 */
@WebServlet("/newsManager")
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String currentPage = request.getParameter("paging");
		int currentPageC=1;
		Page page = new Page();
		
		page.setPageSize(5);
		if(currentPageC<=1) {
			currentPageC=1;
		}
		if(currentPage==null||currentPage.equals("")) {
			currentPageC=1;
		}else
		{
			 currentPageC = Integer.parseInt(currentPage);
		}
		
		
		page.setCurrentPage(currentPageC);
		page.setBegin((page.getCurrentPage()-1)*page.getPageSize());
		new PageService().pageSplit(page);
		
		request.getSession().setAttribute("page", page);
		response.sendRedirect(request.getContextPath()+"/main.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
