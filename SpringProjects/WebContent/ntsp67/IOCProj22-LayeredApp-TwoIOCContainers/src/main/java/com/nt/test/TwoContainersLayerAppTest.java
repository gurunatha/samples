package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class TwoContainersLayerAppTest {

	public static void main(String[] args) {
		BeanFactory pFactory=null,cFactory=null;
		StudentController controller=null;
		List<StudentVO> listVO=null;
		//create parent IOC container
		pFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/business-beans.xml"));
		//create child IOC container
		cFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/presentation-beans.xml"),pFactory);
		//get Controller
		controller=cFactory.getBean("stController",StudentController.class);
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
