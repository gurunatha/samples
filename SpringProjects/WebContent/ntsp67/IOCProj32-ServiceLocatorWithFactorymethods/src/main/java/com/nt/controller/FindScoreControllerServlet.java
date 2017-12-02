package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CrickBuzzFindScoreService;

public class FindScoreControllerServlet extends HttpServlet {

	ApplicationContext ctx=null;
	public void init(){
		//create IOCContainer
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  int matchid;
	  CrickBuzzFindScoreService  localService=null;
	  String scoreBoard=null;
	  RequestDispatcher rd=null;
		//read matchid from hyperlinks
		matchid=Integer.parseInt(req.getParameter("mid"));
		//get LocalService class object
		localService=ctx.getBean("crickBuzzService",CrickBuzzFindScoreService.class);
		//use Local Service
		scoreBoard=localService.findScore(matchid);
		System.out.println("Controller:"+scoreBoard);
		//keep ScoreBoard in request scope
		req.setAttribute("score",scoreBoard);
		//forward to view_score.jsp to display results
	    rd=req.getRequestDispatcher("/view_score.jsp");
	    rd.forward(req, res);
	 
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   doGet(req,res);
	}

}
