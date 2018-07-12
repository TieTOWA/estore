package com.service;

import java.util.List;

import com.bean.Report;
import com.common.exception.ReportException;


public interface IReportService {
	/**
	 * 添加公告
	 * */
	void saveReport(Report report) throws ReportException;
	/**
	 * 修改公告
	 * */
	void updateReport(Report report) throws ReportException;
	/**
	 * 删除公告
	 * */
	void delReport(Long reportId) throws ReportException;
	/**
	 * 列出所有公告
	 * */
	List<Report> listAllReport() throws ReportException;
	
	/**
	 * 根据id获取公告详情
	 * @param id
	 * @return Report
	 * @throws ReportException
	 */
	Report listReport(int id) throws ReportException;
}