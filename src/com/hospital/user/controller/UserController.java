package com.hospital.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.user.model.Doctor;
import com.hospital.user.model.Message;
import com.hospital.user.model.User;
import com.hospital.user.service.DoctorService;
import com.hospital.user.service.TouristService;
import com.hospital.user.service.UserService;

@Controller
public class UserController {
	public static String FUname;
	
	@Autowired
	protected UserService userservice;
	
	@Autowired
	protected DoctorService doctorservice;
	
	@Autowired
	protected TouristService tourservice;
	
	@RequestMapping("/")
	public String index(Model model){
		List<Doctor> list = doctorservice.findalldoc();
		model.addAttribute("Doctorlist", list);
		for (Doctor doctor : list) {
			System.out.println(doctor.getDname());
		}
		return "index";
	}
	

	@RequestMapping("/DoctorOne")
	public String doctor1(){
		return "DoctorOne";
	}
	
	@RequestMapping("/modifyuser")
	public String modifyuser(){
		return "modifyuser";
	}
	
	@RequestMapping("/search")
	public String search(String Uname, Model model){
		User user=userservice.findByNo(Uname);
		model.addAttribute("user",user);
		System.out.println(Uname+""+user.getPassword()+""+user.getType());
		return "index";
	}
	@RequestMapping("/login1")
	public String login1(String Uname,String password, Model model){
	
		 
		System.out.println("用户名:"+Uname+"密码："+password);
		User user=userservice.Login(Uname, password);
		
		if(user.getId()!=null)
		{	
		 
			model.addAttribute("user",user);
			
			FUname=user.getId();
			
			List<Message> list = tourservice.showMess(FUname);
			model.addAttribute("messlist",list);
			Doctor doctor = doctorservice.showdoc(FUname);
			model.addAttribute("doctor", doctor);
			return "MessageBoard";
		}
		else 
			return "index";
	}
	@RequestMapping("/FirstStaff")
	public String FirstStaff(){
		return "FirstStaff";
	}
	
	@RequestMapping("/index")
	public String index2(){
		return "index";
	}
	@RequestMapping("/ManagementHospital")
	public String ManagementHospital(){
		return "ManagementHospital";
	}
	@RequestMapping("/ManagementMedicine")
	public String ManagementMedicine(){
		return "ManagementMedicine";
	}
	
	@RequestMapping("/login2")
	public String login2(String Uname,String password, Model model){
	
		 
		System.out.println("用户名:"+Uname+"密码："+password);
		User user=userservice.Login(Uname, password);
		
		if(user.getId()!=null)
		{	
		 
			model.addAttribute("user",user);
			Uname=user.getId();
			return "FirstStaff";
		}
		else 
			return "index";
	}
	
	@RequestMapping("/login3")
	public String login3(String Uname,String password, Model model){	 
		System.out.println("用户名:"+Uname+"密码："+password);
		User user=userservice.Login(Uname, password);
		
		if(user.getId()!=null)
		{	
		 
			model.addAttribute("user",user);
		
			return "ManagementPeople";
		}
		else 
			return "index";
	}
	
	@RequestMapping("/PasswordModify")
	public String  PasswordModify(String Uname,String oldP,String newP1,String newP2, Model model){
		String str="Failed!!";
		System.out.println("用户名:"+Uname+"旧密码："+oldP+"新密码："+newP1);
		if( userservice.PasswordModify(Uname, oldP, newP1, newP2).equals("OK"))
		return "Doctor";
		else
			model.addAttribute("meg",str);
			return "Doctor";
	}
	
}
