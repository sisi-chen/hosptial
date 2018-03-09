package com.hospital.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.user.model.Nurse;
import com.hospital.user.service.AdminService;

@Controller
public class NurseController {
	@Autowired
	protected AdminService adminser;
	
	@RequestMapping("/Nurse")
	public String Nurse(Model model){
		List<Nurse> nurselist = adminser.FindAllNurse();
		model.addAttribute("Nurselist", nurselist);
		for (Nurse nurse : nurselist) {
			System.out.println(nurse.getnName());
		}
		return "Nurse";
	}
	@RequestMapping("/addNurse")
	public String addNurse(){
		return "addNurse";
	}
	@RequestMapping("/addNurse1")
	public String AddNurse(String nNo,String nRank,String aoName,String nName,String nSex,String nTel,String nAge,String hNo){
		Nurse nurse = new Nurse();
		nurse.setnNo(nNo);
		nurse.setnRank(nRank);
		nurse.setAoName(aoName);
		nurse.setnName(nName);
		nurse.setnSex(nSex);
		nurse.setnTel(nTel);
		nurse.setnAge(nAge);
		nurse.sethNo(hNo);
		adminser.AddNurse(nurse);
		System.out.println(nurse.getAoName());
		return "Nurse";
	}
	@RequestMapping("/ModifyNurse")
	public String ModifyNurse(String nNo,Model model){
		System.out.println(nNo);
		Nurse nurse=adminser.FindNurseByNo(nNo);
		model.addAttribute("Nurse",nurse);
		//System.out.println(nurse.getnNo());
		return"ModifyNurse";
		
			
	}
	@RequestMapping("/ModifyNurseDo")
	public String ModifyNurseDo(String nNo,String nRank,String aoName,String nName,String nSex,String nTel,String nAge,String hNo){
		Nurse nurse = new Nurse();
		nurse.setnNo(nNo);
		nurse.setnRank(nRank);
		nurse.setAoName(aoName);
		nurse.setnName(nName);
		nurse.setnSex(nSex);
		nurse.setnTel(nTel);
		nurse.setnAge(nAge);
		nurse.sethNo(hNo);
		adminser.DeleteNurse(nNo);
		adminser.AddNurse(nurse);
		System.out.println(nurse.getAoName());
		return "Nurse";
	}
	
	@RequestMapping("/SearchNurse")
	public String SearchNurse(Model model,String search){
		Nurse nurse = new Nurse();
		System.out.println(search);
		nurse = adminser.FindNurseByNo(search);
		model.addAttribute("nurse",nurse);
		return "SearchNurse";
		
		
	}
}
