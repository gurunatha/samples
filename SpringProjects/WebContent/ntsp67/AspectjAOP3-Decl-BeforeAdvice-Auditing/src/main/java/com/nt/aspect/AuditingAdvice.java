package com.nt.aspect;

import java.io.FileWriter;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AuditingAdvice {
	
	/*public void auditing(JoinPoint jp)throws Throwable{
		FileWriter fw=null;
		System.out.println(((Integer)jp.getArgs()[0])+"has come for Approval on "+new Date());
		//write to audit log file
		fw=new FileWriter("e:/apps/auditLog.txt");
		fw.write(((Integer)jp.getArgs()[0])+"has come for Approval on "+new Date());
		fw.flush();
		fw.close();
	}//method
*/
	
	public void auditing(int oid)throws Throwable{
		FileWriter fw=null;
		System.out.println(oid+"has come for Approval on "+new Date());
		//write to audit log file
		fw=new FileWriter("e:/apps/auditLog.txt");
		fw.write(oid+"has come for Approval on "+new Date());
		fw.flush();
		fw.close();
	}//method
}
