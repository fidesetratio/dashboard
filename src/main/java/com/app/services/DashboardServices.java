package com.app.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mapper.DashboardDao;
import com.app.model.DatabaseDatasource;

@Service
public class DashboardServices {
	@Autowired
	private SqlSession sqlSession;
	
	public List<DatabaseDatasource> getListDatasources(){
		DashboardDao dao=sqlSession.getMapper(DashboardDao.class);
		return dao.getListDatasources();
	}

}
