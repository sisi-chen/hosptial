package com.hospital.user.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.user.model.Doctor;
import com.hospital.user.model.Message;
import com.hospital.user.model.Registration;
import com.hospital.user.service.DoctorService;
import com.hospital.user.service.TouristService;

@Controller
public class RegistrationController {
	
	static public String DName2;
	
	@Autowired
	private TouristService touristService;
	
	@Autowired
	private DoctorService doctorservice;
	
	@Autowired
	protected TouristService touristservice;
	
	@RequestMapping("/addreg")
	public String addreg(String AOName, String DName,Model model){
		System.out.println(AOName);
		System.out.println(DName);
		DName2 =  DName;
		Random rand = new Random();
		int i = rand.nextInt(); //int范围类的随机数
		i = rand.nextInt(1000); //生成0-100以内的随机数
		i = (int)(Math.random() * 1000);
		
		Registration reg = new Registration();
		System.out.println(i);
		reg.setrNo(i);
		reg.setAoName(AOName);
		reg.setdNo(DName);
		reg.setrState("未就诊");
		touristService.Regist(reg);
		List<Doctor> list = doctorservice.findalldoc();
		model.addAttribute("Doctorlist", list);
		List<Message> list2 = touristservice.showMess(DName);
		model.addAttribute("messlist",list2);
		Doctor doctor = doctorservice.showdoc(DName);
		model.addAttribute("doctor", doctor);
		return "MessageBoard";
	}
}
