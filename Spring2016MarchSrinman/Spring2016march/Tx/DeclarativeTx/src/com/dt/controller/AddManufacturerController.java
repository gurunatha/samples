package com.dt.controller;

import com.dt.dto.NewManufacturerDto;
import com.dt.service.ManageManufacturerService;

public class AddManufacturerController {
	private ManageManufacturerService manufacturerService;

	public void addManufacturer(NewManufacturerDto newManufacturerDto) {
		manufacturerService.addManufacturer(newManufacturerDto);
	}

	public void setManufacturerService(
			ManageManufacturerService manufacturerService) {
		this.manufacturerService = manufacturerService;
	}

}
