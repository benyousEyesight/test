package com.benyou.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.benyou.dao.INewsDao;
import com.benyou.dao.IUserDao;
import com.benyou.model.News;
import com.benyou.model.User;
import com.benyou.util.DbUtil;

public class UserService {
//	查询，用于判断用户登录
	public User getUser(User user) {
	SqlSession session = DbUtil.getSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		User qUser = dao.getUser(user);
		session.commit();
		session.close();
		return qUser;
	}
//	查询所有用户信息，用于管理界面显示
	public List<User> getAll()
	{
		SqlSession session = DbUtil.getSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		return dao.getAll();
	}
//	添加一条用户信息
	public boolean addUser(User user)
	{
		boolean flag = false;
		SqlSession session = DbUtil.getSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		IUserDao dbuser = session.getMapper(IUserDao.class);
		if(dbuser==null) {
			
			int row = dao.addUser(user);
			if(row!=0)
			{
				flag = true;
				session.commit();
				session.close();
			}
		}
		
		return flag;
	}
//	删除一条用户信息
	public boolean delUser(User user) 
	{
		boolean flag = false;
		SqlSession session = DbUtil.getSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		INewsDao ndao = session.getMapper(INewsDao.class);
//		根据author编号，查询该作者的记录是否存在
		List<News> author = ndao.getByAuthor(user);
		System.out.println(author); 
		if(author.size()==0) {
			int row = dao.delUser(user);
			if(row!=0)
			{
				flag = true;
				session.commit();
				session.close();
			}
		}
			
		
		
		
		return flag;
	}
	
	
//	根据id获取用户信息，用于修改
	public User getAuser(User user)
	{
		SqlSession session = DbUtil.getSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		return dao.getAuser(user);
	}
	
//	根据id修改用户信息
	public boolean updateUser(User user)
	{
		boolean flag = false;
		SqlSession session = DbUtil.getSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		int row = dao.updateUser(user);
		if(row!=0) 
		{	
			session.commit();
			session.close();
			flag = true;
		}
		return flag;
	}
//	动态模糊查询用户信息
	public List<User> getUserList(User user)
	{
		SqlSession session = DbUtil.getSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		return dao.getListUser(user);
		
	}
	
}


