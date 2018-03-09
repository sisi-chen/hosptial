package com.hospital.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.user.model.Logistic;
import com.hospital.user.service.AdminService;

@Controller
public class LogisticCotroller {
	@Autowired
	protected AdminService adminser;
	
	@RequestMapping("/addLogistic")
	public String addLogistic(){
		return "addLogistic";
	}
	
	@RequestMapping("/lg")
	public String lg(String LNo,String LName,String ANo,String Sex,String Tel,String Age,String State){
		Logistic logistic = new Logistic();
		logistic.setlNo(LNo);
		logistic.setlName(LName);
		logistic.setaNo(ANo);
		logistic.setlSex(Sex);
		logistic.setlTel(Tel);
		logistic.setlAge(Age);
		logistic.setlState(State);
		adminser.AddLogistic(logistic);
		System.out.println(logistic.getlName());
		return "Logistic";
		
	}
	
	@RequestMapping("/Logistic")
	public String Logistic(Model model){
		List<Logistic> logisticlist = adminser.FindAllLogistic();
		model.addAttribute("Logisticlist", logisticlist);
		for (Logistic logistic : logisticlist) {
			System.out.println(logistic.getlName());
			System.out.println(logistic.getaNo());
		}
		return "Logistic";
		
	}
	
	@RequestMapping("/ModifyLogistic")
	public String ModifyLogistic(String lNo,Model model){
		System.out.println(lNo);
		Logistic logistic = adminser.FindLogisticByNo(lNo);
		model.addAttribute("logistic",logistic);
		
		System.out.println(logistic.getlName());
		return "ModifyLogistic";
	}
	@RequestMapping("/ModifyLogisticDo")
	public String ModifyLogisticDo(String LNo,String LName,String ANo,String Sex,String Tel,String Age,String State){
		Logistic logistic = new Logistic();
		logistic.setlNo(LNo);
		logistic.setlName(LName);
		logistic.setaNo(ANo);
		logistic.setlSex(Sex);
		logistic.setlTel(Tel);
		logistic.setlAge(Age);
		logistic.setlState(State);
		adminser.DeleteLogistic(LNo);
		adminser.AddLogistic(logistic);
		
		return "Logistic";
	}
}
