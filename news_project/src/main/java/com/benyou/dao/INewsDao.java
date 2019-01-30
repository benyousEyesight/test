package com.benyou.dao;

import java.util.List;

import com.benyou.model.News;
import com.benyou.model.Page;
import com.benyou.model.User;


public interface INewsDao {
	
	
	
	/**
	 * 获取全部信息的条数
	 * */
	public int getCount();
	/**获取全部的新闻信息，用于管理页面的显示
	 * @return List<News> return a list about news
	 */
	public List<News> getAll(Page page);
	
	/**
	 * add a message about news
	 * @param News
	 * 
	 */
	public int addNews(News news);
	/**
	 * delete a message
	 * @param News
	 * @return rows
	 * */
	public int deleteNews(News news);
	
	/**
	 * update a message
	 * @param News
	 * 
	 * */
	public int updateNews(News news);
	/**
	 * get a news by id 
	 * @param News
	 * @return News
	 * */
	public News getByid(News news);
	
	
	/**
	 * 模糊查询，获取查询内容
	 * @param News
	 * @return List<News>
	 *
	 */
	
	public List<News> queryLike(News news);

	/**
	 * @param news
	 * @return news
	 */
	public List<News> getByAuthor(User user);
	
}
