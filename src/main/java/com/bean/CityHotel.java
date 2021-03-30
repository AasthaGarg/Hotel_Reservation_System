package com.bean;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cityhotel")
public class CityHotel {
	
	@Id
	private int cid;
	private String city;
	private String hotel;
	private String dates;
	private String status; 
	private String room_type;
	private int price;
	private int gst;
	
	public CityHotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CityHotel(int cid, String city, String hotel, String dates, String status, String room_type, int price,
			int gst) {
		super();
		this.cid = cid;
		this.city = city;
		this.hotel = hotel;
		this.dates = dates;
		this.status = status;
		this.room_type = room_type;
		this.price = price;
		this.gst = gst;
	}



	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}


	



	public String getDates() {
		return dates;
	}



	public void setDates(String dates) {
		this.dates = dates;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	@Override
	public String toString() {
		return "CityHotel [cid=" + cid + ", city=" + city + ", hotel=" + hotel + ", dates=" + dates + ", status="
				+ status + ", room_type=" + room_type + ", price=" + price + ", gst=" + gst + "]";
	}

	

}
