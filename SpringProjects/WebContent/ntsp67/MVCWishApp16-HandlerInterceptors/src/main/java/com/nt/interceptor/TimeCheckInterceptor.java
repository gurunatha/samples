package com.nt.interceptor;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 Calendar cal=null;
		 RequestDispatcher rd=null;
		 int hour=0;
		   //Allow request going to Controller class only when it comes in between 9am to 5pm.
		 cal=Calendar.getInstance();
		 //get current hour of the day
		 hour=cal.get(Calendar.HOUR_OF_DAY); //24 hrs format
		 if(hour<9 || hour>=17){
			 rd=request.getRequestDispatcher("/WEB-INF/pages/timeout.jsp");
			 rd.forward(request,response);
			 return false;
		 }
		 else{
			 return true;
		 }
	}//method
}//class
