package com.cm.beans;

import java.util.List;

public class Product {
	private List<String> features;

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Product [features=" + features + "]";
	}

}
