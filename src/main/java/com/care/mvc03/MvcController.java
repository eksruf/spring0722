package com.care.mvc03;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	@RequestMapping("mvc_index")
	public String vmcIndex() {
		return "mvc/index";
	}
	
	@RequestMapping("members")
	public String members(Model model) {
		MvcDAO dao = new MvcDAO();
		ArrayList<MvcDTO> list = dao.members();
		model.addAttribute("list",list);
		System.out.println("members이동");
		return "mvc/members";
	}
	
	@RequestMapping("member")
	public String member(Model model) {
		MvcDAO dao = new MvcDAO();
		MvcDTO member =dao.member();
		model.addAttribute("member",member);
		
		return "mvc/member";
	}
}
