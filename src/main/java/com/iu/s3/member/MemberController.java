package com.iu.s3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/**")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping("memberLogin")
	public void memberLogin() throws Exception {

	}
	@RequestMapping(value="memberLogin", method=RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		memberDTO = memberService.memberLogin(memberDTO); //클라이언트가 치고들어올 새로운  URL주소의 방법은 리다이렉트
		System.out.println("로그인 실패");
		session.setAttribute("member", memberDTO);
		
		return "redirect:../";
	}
	@RequestMapping("memberJoin")
	public void memberJoin() throws Exception {
	}

	@RequestMapping(value="memberJoin", method=RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO) throws Exception {
		int result = memberService.memberJoin(memberDTO);
		return "redirect:../";

	}

}
