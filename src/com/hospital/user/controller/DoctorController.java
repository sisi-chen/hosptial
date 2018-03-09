package com.hospital.user.controller;

import java.util.List;













import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.user.model.Case;
import com.hospital.user.model.Doctor;

import com.hospital.user.model.Patient;
import com.hospital.user.model.Prescription;
import com.hospital.user.model.Registration;
import com.hospital.user.service.AdminService;
import com.hospital.user.service.DoctorService;
import com.hospital.user.service.TouristService;

@Controller


public class DoctorController {
	
	public String id;
	
	@Autowired
	private DoctorService doctorservice;
	
	@Autowired
	private TouristService touristService;
	
	@Autowired
	protected AdminService adminser;
	
	@RequestMapping("/doctor")
	public String doctor(Model model){
		
		return "Doctor";
	}
	
	
	@RequestMapping("/showReg")
	public String showReg(Model model){
		String DName = UserController.FUname;
		
		System.out.println(DName);
		String flag= "1";
		model.addAttribute("flag", flag);
		List<Registration> list=doctorservice.ShowReg(DName);
		model.addAttribute("Reglist", list);
		for(Registration registration:list){

		    System.out.println(registration.getAoName());
		    System.out.println(registration.getdNo());
		    System.out.println(registration.getrNo());
		  }
	return "showreg";
	}
	
	@RequestMapping("/cure")
	public String cure(String id){
		
		System.out.println(id);
		this.id = id;
		
		return "AddPatient";
	}
	
	@RequestMapping("/AddPatient")
	public String AddPitent(String PNo,String PName,String Sex,String Tel
			,String HNo,String Addr,String IdCard,Model model){
		
		Patient patient = new Patient();
		
		patient.setpNo(PNo);
		patient.setpName(PName);
		patient.setSex(Sex);
		patient.setTel(Tel);
		patient.setHNo(HNo);
		patient.setAddr(Addr);
		patient.setIdCard(IdCard);
		model.addAttribute("patient",patient);
		 doctorservice.AddPatient(patient);
		return "AddCase";
	}
	
	@RequestMapping("/AddCase")
	public String AddCase(String cNo,String ill,String pName,String dName
			,String date,String history,String idCard,Model model)
	{
		Case ca = new Case();	
		ca.setcNo(cNo);
		ca.setIll(ill);
		ca.setpName(pName);
		ca.setdName(dName);
		ca.setDate(date);
		ca.setHistory(history);
		ca.setIdCard(idCard);
		ca.setHistory(history);
		doctorservice.AddCase(ca);
		model.addAttribute("ca",ca);
		return "AddPrescription";
	}
	
	@RequestMapping("/AddPrescription")
	public String AddPregistration(String prNo,String pNo,String pName,String MName
			,String dName,String date,Model model){
		Prescription pre = new Prescription();
		pre.setPrNo(prNo);
		pre.setpNo(pNo);
		pre.setpName(pName);
		pre.setMName(MName);
		pre.setdName(dName);
		pre.setDate(date);
		doctorservice.AddPrescription(pre);
		model.addAttribute("pre",pre);
		String Rstate = "已诊断";
		doctorservice.ModifyReg(id, Rstate);
		System.out.println("就诊成功");
		return "Doctor";
	}
	
	@RequestMapping("/showcase")
	public String showcase(){
		return "showcase";
	}
	
	@RequestMapping("/showallcase")
	public String showallcase(Model model){
		String DName = UserController.FUname;
		List<Case> list = doctorservice.findCaseByDName(DName);
		model.addAttribute("caselist",list);
		for (Case case1 : list) {
			case1.getHistory();
			case1.getIll();
		}
		return "showcase";
		
	}
	
	@RequestMapping("/showidcase")
	public String showidcase(String id, Model model){
		
		List<Case> list = doctorservice.findCaseById(id);
		model.addAttribute("caselist",list);
		return "showcase";
	
	}
	
	@RequestMapping("/reply")
	public String reply( Model model){
		return "MessageBoard";
	}
	@RequestMapping("/addDoctor")
	public String addDoctor(){
		return "addDoctor";
	}
	@RequestMapping("/addDoctor1")
	public String addDoctor1(String DNo,String Drank,String AOName,String DName,String Sex,String Tel,String Age,String State){
		Doctor doctor = new Doctor();
		doctor.setDno(DNo);
		doctor.setdRank(Drank);
		doctor.setAoName(AOName);
		doctor.setDname(DName);
		doctor.setdSex(Sex);
		doctor.setdTel(Tel);
		doctor.setdAge(Age);
		doctor.setdState(State);
		adminser.AddDoctor(doctor);
		return "ManagementDoctor";
		
	}
	@RequestMapping("/ModifyDoctor")
	public String ModifyDoctor(String dNo,Model model){
		Doctor doctor = new Doctor();
		System.out.println(dNo+"这里");
		doctor = adminser.SearchDoctor(dNo);
		System.out.println(doctor.getDname()+"在这");
		model.addAttribute("Doctor",doctor);
		return "ModifyDoctor";
		
	}
	@RequestMapping("/ModifyDoctorDo")
	public String ModifyDoctorDo(String DNo,String Drank,String AOName,String DName,String Sex,String Tel,String Age,String State){
		Doctor doctor = new Doctor();
		doctor.setDno(DNo);
		doctor.setdRank(Drank);
		doctor.setAoName(AOName);
		doctor.setDname(DName);
		doctor.setdSex(Sex);
		doctor.setdTel(Tel);
		doctor.setdAge(Age);
		doctor.setdState(State);
		adminser.DeleteDoctor(DNo);
		adminser.AddDoctor(doctor);
		return "ManagementDoctor";
	}
	
	@RequestMapping("/SearchDoctor")
	public String SearchDoctor(Model model,String search){
		Doctor doctor=adminser.SearchDoctor(search);
		System.out.println(search);
		//System.out.println(doctor.getDname());
		model.addAttribute("doctor", doctor);
		return "SearchDoctor";
		
	}
	
	@RequestMapping("/RetireDoctor")
	public String RetireDoctor(String dNo){
		if( adminser.ModifyState(dNo)){
			
			return "ManagementDoctor";
		}
		else
			
			return "ManagementDoctor";
	}
	
	@RequestMapping("/jsp_{jsp}")
	public String showJsp(@PathVariable String jsp){
		return jsp;
	}
	
	@RequestMapping("/ManagementDoctor")
	public String ManagementDoctor(Model model){
		List<Doctor> doctorlist = adminser.FindAllDoctor();
		model.addAttribute("Doctorlist",doctorlist);
		for (Doctor doctor : doctorlist) {
			
		}
		return "ManagementDoctor";
		
	}
}
