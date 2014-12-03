package ca.springmvc.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.springmvc.application.utils.Persone;

/**
 * @author vladygin
 *
 */
@Component
@Scope("prototype")
public class PersoneDAO {
	
	private String selectByPersoneNumber = "SELECT * FROM EMPLOYE WHERE EMPN=?";
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate; 
	}
	
	public Persone getPersoneByID(int personeID){

		Persone persone = this.jdbcTemplate.queryForObject(selectByPersoneNumber,
				new Object[]{Integer.toString(personeID)},
			       new RowMapper<Persone>() {
		            public Persone mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	Persone p = new Persone();
		                p.setPersoneNumber(rs.getString("EMPN"));
		                p.setPersoneName(rs.getString("ENAME"));
		                p.setPersoneJob(rs.getString("EJOB"));
		                p.setPersoneManagerNumber(rs.getString("MGR"));
		                p.setPersoneDepartmentNumber(rs.getString("DEPN"));
		                return p;
		            }
		        });
		return persone;
		
	}
	
	   /* Method to  READ all the employees */
	   @Transactional(propagation=Propagation.SUPPORTS, readOnly=true) 
//	   @Transactional(propagation=Propagation.REQUIRED, readOnly=false) 
	   public ArrayList<Persone> listEmployees( ){
	      Session session = sessionFactory.openSession();
	      ArrayList<Persone> list = new ArrayList<Persone>();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("from ca.springmvc.application.utils.Persone").list(); 
	         for (Iterator iterator = 
	                           employees.iterator(); iterator.hasNext();){
	            Persone p = (Persone) iterator.next();
	            
//	            p.printPersoneData();
//	            
//	            System.out.println("<<<<<<<<<<<>>>>>>>>>>>");
//	            System.out.println("\n\n\n\n");
	            list.add(p);
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return list;
	   }
	   
	   

}