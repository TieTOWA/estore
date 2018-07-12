package com.service.impl;

import java.util.List;

import com.bean.Report;
import com.common.exception.ReportException;
import com.service.IReportService;
import com.utils.BaseDao;

public class ReportServiceImpl implements IReportService {

	@Override
	public void saveReport(Report report) throws ReportException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReport(Report report) throws ReportException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delReport(Long reportId) throws ReportException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 列出所有公告
	 * */
	@Override
	public List<Report> listAllReport() throws ReportException {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_report";
		Object[] params = {};
		List<Report> list = baseDao.find(sql, params, Report.class);
		return list;
	}

	@Override
	public Report listReport(int id) throws ReportException {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_report where id = ?";
		Object[] params = {id};
		List<Report> list = baseDao.find(sql, params, Report.class);
		if (list.size() != 0) {
			return list.get(0);
		}else {
			return null;
		}
	}

}
