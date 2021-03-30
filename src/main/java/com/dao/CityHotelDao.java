package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;


import com.bean.CityHotel;




public class CityHotelDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	 public List<CityHotel> getAllRecords() {
			
			String sql = "select * from cityhotel";
			
			List<CityHotel> c = jdbcTemplate.query(sql, new CityHotelMapper());
			return c;
		}
	
     public List<CityHotel> checkAvailability(CityHotel cityhotel){
    	 
    	String sql = "select * from cityhotel where status ='Available' and city='" + cityhotel.getCity() + "' and hotel='" + cityhotel.getHotel() + "' and dates=TO_DATE('"+cityhotel.getDates()+"','yyyy-mm-dd')";
 		
 		List<CityHotel> c = jdbcTemplate.query(sql, new CityHotelMapper());
 		return c;
    	 
     }
	
	class CityHotelMapper implements RowMapper<CityHotel> {
		
		public CityHotel mapRow(ResultSet rs, int arg1) throws SQLException {
			
			CityHotel c=new CityHotel();
			
			    c.setCid(rs.getInt("cid"));
	            c.setCity(rs.getString("city"));
	            c.setHotel(rs.getString("hotel"));
	            c.setDates(rs.getString("dates"));
	            c.setStatus(rs.getString("status"));
	            c.setRoom_type(rs.getString("room_type"));
	            c.setPrice(rs.getInt("price"));
	            c.setGst(rs.getInt("gst"));
			
			
			return c;
		}

	}

}
