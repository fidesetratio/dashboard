package com.app.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.common.DataSourceKey;
import com.app.configuration.DynamicDataSourceContextHolder;
import com.app.model.DatabaseDatasource;
import com.app.services.DashboardServices;

@RestController
public class TestRestController {
	
	@Autowired
	private DashboardServices dashboardServices;
	
	@GetMapping("/test")
	public List<DatabaseDatasource> test() {
		DynamicDataSourceContextHolder.useSlaveDataSource();
		return dashboardServices.getListDatasources();
	}

}
