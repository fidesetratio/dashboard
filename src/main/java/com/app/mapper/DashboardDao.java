package com.app.mapper;

import java.util.List;

import com.app.model.DatabaseDatasource;

public interface DashboardDao {
	public List<DatabaseDatasource> getListDatasources();
}
