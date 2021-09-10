package com.app.mapper;

import java.util.List;

import com.app.model.DatabaseDatasource;
import com.app.model.DynamicQuery;

public interface DashboardDao {
	public List<DatabaseDatasource> getListDatasources();
	public DynamicQuery getQueryById(Integer queryId);
}
