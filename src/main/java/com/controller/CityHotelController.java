package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.CityHotel;
import com.dao.CityHotelDao;

@Controller
public class CityHotelController {
	
	@Autowired
	CityHotelDao dao;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/SearchHotel")
	public ModelAndView searchHotel(HttpServletRequest request,HttpServletResponse response) {
		
		CityHotel obj = new CityHotel();
		ModelAndView mv = new ModelAndView("searchHotel");
		mv.addObject("cityhotel",obj);
		
		List<CityHotel> list = dao.getAllRecords();
		
		if(list!=null) {
			
			mv.addObject("lists",list);
			
		}
		
		return mv;
	}
	
	@RequestMapping("/SearchResult")
	public ModelAndView searchResult(HttpSession session, @ModelAttribute("cityhotel") CityHotel cityhotel) {
		
		ModelAndView mv = null;
		List<CityHotel> list1 = dao.checkAvailability(cityhotel);
		
		if(list1.isEmpty()) {
			mv=new ModelAndView("showNotAvailable");
				
		}
		else {
			String hotel=null;
			for(CityHotel l:list1) {
				hotel = l.getHotel();
			}
			session.setAttribute("hotel", hotel);
			mv=new ModelAndView("showAvailable");
			mv.addObject("list",list1);
		}
		
		return mv;
		
	}
	
	@RequestMapping("/MakeReservation")
	public String makeReservation() {
		return "reservation";
	}
	
	@RequestMapping("/ConfirmReservation")
	public ModelAndView confirmReservation(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv= new ModelAndView("confirmPage");
		String name = request.getParameter("name");
		String hotel = (String) session.getAttribute("hotel");
		mv.addObject("name",name);
		mv.addObject("hotel",hotel);
		return mv;
		
	}
	

}
