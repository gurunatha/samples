package com.nt.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.hlo.EmpDetailsHLO;
@Repository("empDAO")
public class EmpDetailsDAOImpl implements EmpDetailsDAO {
	private static final String HQL_GET_EMPDETAILS_BY_DESG="FROM EmpDetailsHLO WHERE job=:desg";
	//private static final String HQL_DELETE_EMPDETAILS_BY_DESG="DELETE FROM EmpDetailsHLO WHERE job=?";
	private static final String HQL_DELETE_EMPDETAILS_BY_DESG="DELETE FROM EmpDetailsHLO WHERE job=:desg";
	 @Autowired
	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int insert(EmpDetailsHLO hlo) {
		int idVal=0;
		  idVal=(Integer)ht.save(hlo);
		return idVal;
	}

	@Override
	public EmpDetailsHLO get(int eno) {
		EmpDetailsHLO hlo=null;
		hlo=ht.get(EmpDetailsHLO.class,eno);
		return hlo;
		
	}

	@Override
	public List<EmpDetailsHLO> getEmpDetailsByDesg(String desg) {
		List<EmpDetailsHLO> listHLO=null;
		listHLO=(List<EmpDetailsHLO>) ht.findByNamedParam(HQL_GET_EMPDETAILS_BY_DESG, "desg",desg);
		return listHLO;
	}
	
	@Override
	public int deleteEmployeesByDesg(String desg) {
		int count=0;
		//count=ht.bulkUpdate(HQL_DELETE_EMPDETAILS_BY_DESG,desg);
		count=ht.execute(new MyHibernateCallback(desg));
		return count;
	}
	
	private class MyHibernateCallback implements HibernateCallback<Integer>{
		private String desg;
       public MyHibernateCallback(String desg) {
        	this.desg=desg;
		}
		@Override
		public Integer doInHibernate(Session ses) throws HibernateException {
           int count=0;
           Query query=null;
              query=ses.createQuery(HQL_DELETE_EMPDETAILS_BY_DESG);
              query.setString("desg",desg);
              count=query.executeUpdate();
			return count;
		}//doInHibernate(-)
	}//methd

}//class
