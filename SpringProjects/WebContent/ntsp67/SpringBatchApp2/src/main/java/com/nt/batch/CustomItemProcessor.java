package com.nt.batch;
import org.springframework.batch.item.ItemProcessor;


public class CustomItemProcessor implements ItemProcessor<String[], String> {

	@Override
	public String process(String bookNameWithoutAuthor[]) throws Exception {
		System.out.println("ItemProcessor:process(-)");
		String bookNameWithAuthor = "Book Name - "+bookNameWithoutAuthor[0]+" | Author Name - ";
		
		if("Core Java".equalsIgnoreCase(bookNameWithoutAuthor[0])){
			bookNameWithAuthor += "Sriniwas";
		}else if("Design Patterns".equalsIgnoreCase(bookNameWithoutAuthor[0])){
			bookNameWithAuthor += "raja ";
		}else if("Advance Java".equalsIgnoreCase(bookNameWithoutAuthor[0])){
			bookNameWithAuthor += "ravi ";
		}else if("Spring FrameWork".equalsIgnoreCase(bookNameWithoutAuthor[0])){
			bookNameWithAuthor += "karan";
		}else if("Hibernate Framework".equalsIgnoreCase(bookNameWithoutAuthor[0])){
			bookNameWithAuthor += "rani";
		}
		return bookNameWithAuthor;
	}

}
