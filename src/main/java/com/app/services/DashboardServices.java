package com.app.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mapper.DashboardDao;
import com.app.model.DatabaseDatasource;
import com.app.model.DynamicQuery;

@Service
public class DashboardServices {
	@Autowired
	private SqlSession sqlSession;
	
	public List<DatabaseDatasource> getListDatasources(){
		DashboardDao dao=sqlSession.getMapper(DashboardDao.class);
		return dao.getListDatasources();
	}
	
	public DynamicQuery getQueryById(Integer queryId) {
		DashboardDao dao=sqlSession.getMapper(DashboardDao.class);
		return dao.getQueryById(queryId);
	}

}
