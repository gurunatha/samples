package com.nt.batch;

import java.util.Arrays;
import java.util.List;

import org.springframework.batch.item.ItemWriter;


public class CustomItemWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> bookNameWithAuthor) throws Exception {
		System.out.println("ItemWriter: write(-)");
        for(String item:bookNameWithAuthor){
        	 System.out.println(item);
        }//for

	}

}
