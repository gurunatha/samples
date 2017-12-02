package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UploadCommand;

@Controller
public class FileUploadController {
	
	@RequestMapping(value="/upload.htm",method=RequestMethod.GET)
	public  String  showForm(Map<String,Object> model){
		UploadCommand cmd=null;
		//create Command class object
		cmd=new UploadCommand();
		//add command object to Model attribute
		model.put("uplCmd",cmd);
		return "form_file_upload";
	}//method
	
	@RequestMapping(value="/upload.htm",method=RequestMethod.POST)
	public  String  uploadFile(Map<String,Object> model,@ModelAttribute("uplCmd") UploadCommand cmd)throws Exception{
		String destLocation="e:/springfileuploads";
		File file=null;
		InputStream is=null;
		OutputStream os=null;
		//Create Dest Location folder if not available
		file=new File(destLocation);
		if(!file.exists()){
			file.mkdir();
		}
		//get Input Stream representing uploaded file
		is=cmd.getFile().getInputStream();
		//get OutpuStream piointing to empty Dest file
		os=new FileOutputStream(file.getPath()+"/"+cmd.getFile().getOriginalFilename());
		//complete file uploading
		IOUtils.copy(is,os);
		
		//add uploded file name as model attribute
		model.put("upl_filename",cmd.getFile().getOriginalFilename());
		
		return "result";
	}//method

}
