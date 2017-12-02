package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.LoginDAO;
import com.nt.domain.User;
import com.nt.dto.UserDTO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	 private LoginDAO dao;

	@Override
	public String authenticate(UserDTO dto) {
		long count=0;
		User user=null;
		//Convert dto to domain class object
		user=new User();
		BeanUtils.copyProperties(dto, user);
	    //use LoginDAO
		count=dao.validate(user);
		if(count==0)
		   return "Invalid Credentials";
		else
			return "Valid Credentials";
	}//method
}//class
