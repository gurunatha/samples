package com.nt.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.CompanyPhonesInfo;
import com.nt.beans.DoctorsInfo;
import com.nt.beans.FacultyInfo;
import com.nt.beans.PersonDetails;
import com.nt.beans.Student;

public class CollectionTest {
	
	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null;
		PersonDetails pDetails=null;
		//create IOC conainer
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		stud=factory.getBean("st",Student.class);
		System.out.println(stud);
		System.out.println(".......................................");
		//get Bean
		pDetails=factory.getBean("pDetails",PersonDetails.class);
		System.out.println(pDetails);
		System.out.println("............................................");
		//getBean
		CompanyPhonesInfo cpi=factory.getBean("cpi",CompanyPhonesInfo.class);
		System.out.println(cpi);
		System.out.println("............................................");
		//getBean
		FacultyInfo fi=factory.getBean("fi",FacultyInfo.class);
		System.out.println(fi);
		System.out.println("...........................................");
		//getBean
		DoctorsInfo info=factory.getBean("di",DoctorsInfo.class);
		System.out.println(info);
	}//main
}//class
