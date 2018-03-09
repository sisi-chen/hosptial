package com.hospital.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.user.model.CheckIO;
import com.hospital.user.model.Staff;
import com.hospital.user.service.AdminService;
import com.hospital.user.service.StaffService;

@Controller
public class StaffController {
	@Autowired
	protected AdminService adminser;
	@Autowired
	protected StaffService staffservice;
	
	
	@RequestMapping("/Staff")
	public String Staff(Model model){
		List<Staff> stafflist = adminser.FindAll();
		model.addAttribute("Stafflist",stafflist);
		for (Staff staff : stafflist) {
			System.out.println(staff.getsAge());
			System.out.println(staff.getsName());
		}
		return "Staff";
	}
	
	@RequestMapping("/addStaff")
	public String addStaff(){
		return "addStaff";
	}
	@RequestMapping("/as")
	public String addStaff1(String sNo,String sName,String sSex,String sAge,String sTel,String sState){
		Staff staff = new Staff();
		staff.setsNo(sNo);
		staff.setsName(sName);
		staff.setsSex(sSex);
		staff.setsAge(sAge);
		staff.setsTel(sTel);
		staff.setsState(sState);
		adminser.AddStaff(staff);
		System.out.println(staff.getsName());
		return "Staff";
		
	}
	@RequestMapping("/SearchStaff")
	public String SearchStaff(Model model,String search){
		Staff staff = new Staff();
		staff = adminser.FindStaffByNo(search);
		model.addAttribute("staff",staff);
		return "SearchStaff";
		
	}
	
	@RequestMapping("/ModifyStaff")
	public String ModifyStaff(String sNo,Model model){
		System.out.println(sNo);
		Staff staff =adminser.FindStaffByNo(sNo);
		model.addAttribute("Staff",staff);
		//System.out.println(nurse.getnNo());
		return"ModifyStaff";
	}
	
	@RequestMapping("/ModifyStaffDo")
	public String ModifyStaff(String sNo,String sName,String sSex,String sAge,String sTel,String sState){
		Staff staff = new Staff();
		staff.setsNo(sNo);
		staff.setsName(sName);
		staff.setsSex(sSex);
		staff.setsAge(sAge);
		staff.setsTel(sTel);
		staff.setsState(sState);
		adminser.DeleteStaff(sNo);
		adminser.AddStaff(staff);
		return "Staff";
		
	}
	
	@RequestMapping("/Patient")
	public String patient(Model model){
		List<CheckIO> checkiolist = staffservice.FindAllCheckIO();
		model.addAttribute("Checkiolist",checkiolist);
		return "Patient";
		
	}
	
	@RequestMapping("/addPatientDo")
	public String addPatientDo(String hosNo,String hNo,String age,String family,String fTel,String selfTel,String ill,String ClDate,String CODate){
		CheckIO checkio = new CheckIO();
		checkio.setHosNo(hosNo);
		checkio.sethNo(hNo);
		checkio.setAge(age);
		checkio.setFamily(family);
		checkio.setfTel(fTel);
		checkio.setSelfTel(selfTel);
		checkio.setIll(ill);
		checkio.setclDate(ClDate);
		checkio.setcODate(CODate);
		staffservice.AddCheckIO(checkio);
		return "Patient";
	}
	
	@RequestMapping("/addPatient")
	public String addPatient(){
		return "addPatient";
	}
	
	@RequestMapping("/SearchPatient")
	public String SearchPatient(Model model,String search){
		CheckIO checkio = new CheckIO();
		checkio = staffservice.FindCheckIOByNo(search);
		model.addAttribute("checkio", checkio);
		return "SearchPatient";
		
	}
}
