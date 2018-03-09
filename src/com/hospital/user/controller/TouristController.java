package com.hospital.user.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;









import com.hospital.user.model.Doctor;
import com.hospital.user.model.Message;
import com.hospital.user.service.DoctorService;
import com.hospital.user.service.TouristService;


@Controller
public class TouristController {
	
	@Autowired
	protected TouristService touristservice;
	
	@Autowired
	private DoctorService doctorservice;
	
	@RequestMapping("/showlist")
	public String index(String AOName,Model model){
		System.out.println(AOName);	
		List<Doctor> list=touristservice.showDoctor(AOName);
		model.addAttribute("Doctorlist", list);
		model.addAttribute("AOName",AOName);
		return "index";
	}
	
	@RequestMapping("/leavemess")
	public String leavemess(String message,Model model){
		Message mess = new Message();
		String DNo = RegistrationController.DName2;
		Random rand = new Random();
		int i = rand.nextInt(); //int范围类的随机数
		i = rand.nextInt(1000); //生成0-100以内的随机数
		i = (int)(Math.random() * 1000);
		mess.setMessageNo(i);
		mess.setContent(message);
		mess.setdNo(DNo);
		List<Message> list = touristservice.showMess(DNo);
		model.addAttribute("messlist",list);
		touristservice.LeaveMessage(mess);
		
		List<Message> list2 = touristservice.showMess(RegistrationController.DName2);
		model.addAttribute("messlist",list2);
		
		Doctor doctor = doctorservice.showdoc(RegistrationController.DName2);
		model.addAttribute("doctor", doctor);
		return "MessageBoard";
	}
	
}
