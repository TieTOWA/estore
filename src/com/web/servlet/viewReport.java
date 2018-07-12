package com.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Report;
import com.common.exception.ReportException;
import com.service.IProductService;
import com.service.IReportService;
import com.service.impl.ProductServiceImpl;
import com.service.impl.ReportServiceImpl;

/**
 * Servlet implementation class viewReport
 */
@WebServlet("/viewReport")
public class viewReport extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//将request获取的id转换为int类型
		Integer id = new Integer(request.getParameter("reportId"));
		IReportService reportService = new ReportServiceImpl();
		try {
			Report report = reportService.listReport(id);
			HttpSession session = request.getSession();
			session.setAttribute("report", report);
			response.sendRedirect("detail.jsp");
		} catch (ReportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
