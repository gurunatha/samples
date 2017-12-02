package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class TwoContainersLayerAppTest {

	public static void main(String[] args) {
		ApplicationContext parentCtx=null,childCtx=null;
		StudentController controller=null;
		List<StudentVO> listVO=null;
		//create parent IOC container
		parentCtx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/business-beans.xml");
		//create child IOC container
		childCtx=new FileSystemXmlApplicationContext (new String[]{"src/main/java/com/nt/cfgs/presentation-beans.xml"},parentCtx);
		//get Controller
		controller=childCtx.getBean("stController",StudentController.class);
		try{
		 listVO=controller.getStudentDetailsByAvg(50.2f,90.1f);
		 for(StudentVO vo:listVO){
			 System.out.println(vo+"\n");
		 }
		}
		catch(Exception e){
			System.out.println("Internal problem");
			e.printStackTrace();
		}
	}//main
}//class
