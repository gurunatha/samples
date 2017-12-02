package com.nt.service;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishServiceImpl implements WishService {

	@Override
	public String geneateWishMsg() {
		
		return "Good morning";
	}

}
