package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes({"user_id","policyName","insuranceTenure","sumInsured","policyId"})
public class InsuranceController {
	
	@Autowired
	InsuranceRepository insuranceRepository;
	
	@Autowired
	PolicyRepository policyRepository;
	
	@GetMapping("hello")
	public String insurance() {
		System.out.println("inside insaurance");
		return "insurance";
	}
	
	@GetMapping("login")
		public String loginpage() {
			System.out.println("inside login");
			return "login";
		}
	
	@GetMapping("signUp")
	public String signUppage() {
		System.out.println("inside signUp");
		return "signUp";
	}
	
	
	@PostMapping("dashboard")
	public String dashboard(@RequestParam("user_id")int user_id,@RequestParam("password") String password, Model model, @ModelAttribute Insurance insurance) {
	    
	    model.addAttribute("user_id", user_id);
	    model.addAttribute("password", password);
	    System.out.println("user id is " + user_id);
	    Optional<Insurance> insOpt = insuranceRepository.findById(user_id);
	    Insurance ins = insOpt.get();
	    int dbId=ins.getUser_id();
	    System.out.println(ins.getUser_id());
	    String dbPass=ins.getPassword();
	        System.out.println("user id from user " +user_id);
	        System.out.println("password from user "+password);
	        
	        System.out.println("user id from db " +dbId);
	        System.out.println("password from db "+dbPass);
	    
	    if (user_id==(dbId) && password.equalsIgnoreCase(dbPass)) {
	    	System.out.println("inside dashboard");
	        return "dashboard";
	    } else {
	    	System.out.println("inside login");
	        return "login";
	    }
	}

	@PostMapping("login")
	public String signup(@RequestParam("user_id") int user_id,@RequestParam("password") String password,@RequestParam("name") String name,@RequestParam("number") String number,@ModelAttribute Insurance insurance) {
		System.out.println("inside signup");
		insurance.setUser_id(user_id);
		insuranceRepository.save(insurance);
	
		
		return "login";
	}
	
	@GetMapping("policy")
	public String policy() {
		System.out.println("inside policy");
		return "policy";
	}
	
	@GetMapping("portfolio")
	public String portfolio() {
		System.out.println("inside portfolio");
		return "portfolio";
	}
	
	@GetMapping("logout")
	public String logout() {
		System.out.println("inside logout");
		return "login";
	}
	
	@GetMapping("dashboard")
	public String dashboard(@RequestParam("policyId") int policyId,@RequestParam("policyName") String policyName,@RequestParam("insuranceTenure") String insuranceTenure,@RequestParam("premiumAmount") String premiumAmount,@RequestParam("sumInsured") String sumInsured,@ModelAttribute Policy policy,@SessionAttribute("user_id") String user_id,Model model) {
		System.out.println("inside dashboard");
//		Optional<Policy> polOpt = policyRepository.findById(policyId);
//	    Policy pol = polOpt.get();
//	    int polId=pol.getPolicyId();
		model.addAttribute("user_id", user_id);
		model.addAttribute("policyId",policyId);
		model.addAttribute("policyName", policyName);
		model.addAttribute("insuranceTenure", insuranceTenure);
		model.addAttribute("sumInsured", sumInsured);
		System.out.println("user id 2 is" +user_id);
		policy.setUser_id(Integer.parseInt(user_id));
		policyRepository.save(policy);
		return "dashboard";
		
	
	}
	
	@GetMapping("deletePolicy")
	public String deletePolicy(Model model, @SessionAttribute("policyId") int policyId) {
	    System.out.println("inside policy delete");
	    List<Policy> policyOpt = policyRepository.findByPolicyId(policyId);
	    for(Policy p : policyOpt) {
			System.out.println(p.getPolicyId());
		}
	    return "dashboard";
	}

}
