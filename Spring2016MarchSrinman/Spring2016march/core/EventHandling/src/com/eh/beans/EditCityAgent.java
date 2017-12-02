package com.eh.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EditCityAgent implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void editCity(int cityId, String cityName) {
		// update the data into database
		ReloadEvent event = null;

		event = new ReloadEvent(this, "tblCities");
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
