package com.benyou.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.benyou.dao.INewsDao;
import com.benyou.model.News;
import com.benyou.model.Page;
import com.benyou.util.DbUtil;





public class NewsService {
	
	
	/**
	 * 查询所有新闻消息，用于主页显示
	 * @author benyou
	 * @return List<News> a List about all news
	 */
	public List<News> getAll(Page page)
	{
		SqlSession session = DbUtil.getSession();
		INewsDao newsDao = session.getMapper(INewsDao.class);
		List<News> newslist = newsDao.getAll(page);
		session.commit();
		session.close();
		return newslist;
	}
	/**
	 * 根据新闻的编号，删除一条新闻
	 * @author benyou
	 * @param id
	 * @return boolean flag ,if flag is true,this method is successful 
	 */
	public boolean deleteNews(News news) {
		boolean flag = false;
		SqlSession session = DbUtil.getSession();
		INewsDao newsDao = session.getMapper(INewsDao.class);
		int rows = newsDao.deleteNews(news);
		if(rows!=0) 
		{
			session.commit();
			session.close();
			flag = true;
		}
		else
		{
			session.rollback();
		}
		
		return flag;
	}
	
	/**add a news
	 * @author benyou
	 * @param News
	 * @return boolean flag 
	 */
		public boolean addNews(News news)
		{	
			boolean flag = false;
			SqlSession session = DbUtil.getSession();
			INewsDao newsDao = session.getMapper(INewsDao.class);
			News dbnews = newsDao.getByid(news);
			System.out.println(dbnews);
			if(dbnews!=null) 
			{
				return flag;
			}else {
				int rows = newsDao.addNews(news);
				
				if(rows!=0)
				{	
					session.commit();
					session.close();
					flag=true;
				}
				else 
				{
					session.rollback();
				}
			}
			
			
			return flag;
		}
		/**
		 * get a news by id
		 * @author benyou
		 *
		 */	
		public News getNews(News news) 
		{
			SqlSession session = DbUtil.getSession();
			INewsDao newsDao = session.getMapper(INewsDao.class);
			return newsDao.getByid(news);
		}
		
		/**
		 * save the updatenews
		 * @author benyou
		 * @param News
		 * @return boolean flag 
		 * 
		 */
		public boolean updateNews(News news) 
		{	
			boolean flag = false;
			SqlSession session = DbUtil.getSession();
			INewsDao newsDao = session.getMapper(INewsDao.class);
			int rows = newsDao.updateNews(news);
			if(rows!=0)
			{
				session.commit();
				session.close();
				flag = true;
			}else 
			{
				session.rollback();
			}
			
			return flag;
			
		}
		
		/**
		 * 模糊查询新闻
		 * @author benyou
		 * @param News
		 * @return List<News> 
		 * 
		 */
		public List<News> queryLike(News news)
		{
			SqlSession session = DbUtil.getSession();
			INewsDao newsDao = session.getMapper(INewsDao.class);
			List<News> newsList = newsDao.queryLike(news);
			return newsList;
			
		}
		
}

