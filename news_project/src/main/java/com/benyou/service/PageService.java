package com.benyou.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.benyou.dao.INewsDao;
import com.benyou.model.News;
import com.benyou.model.Page;
import com.benyou.util.DbUtil;

public class PageService {
	
	public void pageSplit(Page p) {
		SqlSession session = DbUtil.getSession();
		INewsDao ndao = session.getMapper(INewsDao.class);
		int all = ndao.getCount();
		//计算总页数 总记录条数除以每页的记录
		int a = p.getPageSize();//每页的记录条数
		int totalpage = all%a==0?all/a:(all/a)+1;
		
		p.setSize(totalpage);
		if(p.getCurrentPage()<=1) {
			p.setCurrentPage(1);
		}
		if(p.getCurrentPage()>p.getSize()) {
			p.setCurrentPage(p.getSize());
			p.setBegin((p.getCurrentPage()-1)*p.getPageSize());
		}
		List<News> list = new NewsService().getAll(p);
		p.setData(list);
		
	}
	
}
