package com.care.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("test")
	public void test() {
		System.out.println("===test연결");
	}
	
	@RequestMapping(value="index") //  url경로
	public String index111111() {
		return "member/index"; //jsp경로(index.jsp의 .jsp는 생략)
	}
	
	@RequestMapping(value="login")
	public String login(Model model) {
		String[] str = {"aaa","bbb","ccc"};
		model.addAttribute("str",str);

		model.addAttribute("test","로그인페이지"); // 자신과 연결된 jsp까지만 값이 유지 (지정한 이름을 통해 value값 출력)
		return "member/login";
	}
	
	@RequestMapping("logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("logout","로그아웃페이지입니다."); //뷰로 보낼 데이터 값설정
		mv.setViewName("member/logout"); //뷰의 이름
		
		return mv;
	}
}
