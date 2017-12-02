package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class OrderAuditingAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		FileWriter fw=null;
		System.out.println("target method name"+method.getName());
		System.out.println("target class name"+target.getClass());
       System.out.println("target method args"+Arrays.toString(args));
        //access and modify target method argument values
         if(((Integer)args[0])<0)
        	  args[0]=((Integer)args[0])*-1;
       
       //write audit info to Audit Log file...
       try{
    	   fw=new FileWriter("e:/AuditLog.txt");
    	   fw.write(args[0]+" order has come for approval at "+new Date());
    	   fw.flush();
    	   fw.close();
       }//try
       catch(Exception e){
    	   e.printStackTrace();
       }
	}//method
}//class
