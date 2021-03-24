package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/**")
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping("bankbookUpdate")
	public void setUpdate(BankBookDTO bankBookDTO, Model model) throws Exception {
		
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
		
	}
	@RequestMapping(value="bankbookUpdate", method=RequestMethod.POST)
	public String setUpdate(BankBookDTO bankBookDTO) throws Exception {
		int result = bankBookService.setUpdate(bankBookDTO);
		return "redirect:./bankbookList";
	}
	
	
	@RequestMapping("bankbookDelete")
	public String setDelete(BankBookDTO bankBookDTO) throws Exception {
		System.out.println("Delete");
		System.out.println(bankBookDTO.getBookNumber());
		int result = bankBookService.setDelete(bankBookDTO);
		System.out.println(result);
		
		return "redirect:./bankbookList";
	}
	
	@RequestMapping("bankbookList") //url이 하나 다 하면 이렇게 경로 지정해도됨 더있으면 사용안됨
	public void getList(Model model) throws Exception {
		List<BankBookDTO> ar = bankBookService.getList();	
		model.addAttribute("list", ar);
	}
	
	@RequestMapping(value = "/bankbook/bankbookSelect")
	public ModelAndView getSelect(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		
		mv.addObject("dto", bankBookDTO);
		mv.setViewName("bankbook/bankbookSelect");
		return mv;
	}
	
}
