package com.nt.service;

import java.util.List;
import java.util.Map;

public interface DBOperationService {
   public  String  register(int no,String name,String job,int salary);
   public  int  fetchSalary(int no);
   public  Map<String,Object> fetchEmpDetailsByNo(int no);
   public List<Map<String,Object>> listEmpDetailsByDesg(String desg);
   public String hikeSalary(int no,float percentage);
}
