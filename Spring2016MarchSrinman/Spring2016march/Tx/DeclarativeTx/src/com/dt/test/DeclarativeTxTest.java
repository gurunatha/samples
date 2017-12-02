package com.dt.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt.controller.AddManufacturerController;
import com.dt.dto.NewManufacturerDto;

public class DeclarativeTxTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/dt/common/application-context.xml");

		AddManufacturerController addManufacturerController = context.getBean(
				"addManufacturerController", AddManufacturerController.class);

		NewManufacturerDto nManufacturerDto = new NewManufacturerDto();
		nManufacturerDto.setManufacturerId(1);
		nManufacturerDto.setManufacturerName("Tata");
		nManufacturerDto.setBrandName("Tata Industries");
		nManufacturerDto.setEstDate(new Date());

		nManufacturerDto.setProductId(1);
		nManufacturerDto.setProductName("Tata Salt");
		nManufacturerDto.setType("groceries");
		nManufacturerDto.setPrice(353.34f);
		nManufacturerDto.setProductManufacturerId(2);
		addManufacturerController.addManufacturer(nManufacturerDto);
		System.out.println("added manufacturer....");
	}
}




