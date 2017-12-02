package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileDownloadController {
	private static final String DOWNLOD_PATH="E:/springfileuploads";
	
	@RequestMapping("/home.htm")
	public  String  showHomePage(Map<String,Object> model){
		File TargetFolder=null;
		File lof[]=null;
		List<String> d_files_list=null;
		//get All the file names from target folder
		TargetFolder=new File(DOWNLOD_PATH);
		lof=TargetFolder.listFiles();
		d_files_list=new ArrayList();
		for(File file:lof){
			if(!file.isDirectory()){
				d_files_list.add(file.getName());
			}
		}
		//add list of files to model
		model.put("filesList",d_files_list);
		
		return "view_files";
	}//method
	
	
	@RequestMapping("/download.htm")
	public  void  download(HttpServletResponse res,@RequestParam("file_name") String fileName)throws Exception{
	   File file=null;
	   InputStream is=null;
	   OutputStream os=null;
	   // file downloading settings
	   res.addHeader("Content-Disposition","attachment;fileName="+fileName);
		//locate the file to be downloaded
	   file=new File(DOWNLOD_PATH+"/"+fileName);
	   //create InputStream pointing to file to be downloaded
		is=new FileInputStream(file);
		//create Output Stream pointing to response object
		os=res.getOutputStream();
		//Copy the file content to response object
		IOUtils.copy(is, os);
	}//method
	
}//class
