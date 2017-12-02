package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface ListEmpsDAO {
   public List<Map<String,Object>>  getEmployeeDetailsByDesg(String desgs);
}
