package com.ee.y1.bankbook;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankBookController {
	
	private BankBookDAO bankBookDAO;
	private BankBookService bankBookService;
	
	//상품 리스트
	@RequestMapping(value="/bankbook/bankbookList")
	public void bankbookList(ModelAndView modelAndView, BankBookDTO bankBookDTO) throws Exception{

		System.out.println("-- BankBook List --");
		
		List<BankBookDTO> ar = bankBookService.bankbookList(bankBookDTO);
		
		//값을 받아서 보냄
		modelAndView.addObject("list", ar);
		modelAndView.setViewName("/bankbook/bankbookList");
		
		
	}
	
	//상품 상세
	@RequestMapping(value="/bankbook/bankbookSelect")
	public void bankbookSelect(BankBookDTO bankBookDTO) throws Exception{
		
		System.out.println("-- BankBook Select --");
		
	}
	
	
	
	//상품 등록
	@RequestMapping(value="/bankbook/bankbookAdd")
	public void bankbookAdd(BankBookDTO bankBookDTO) throws Exception{
		
		System.out.println("-- BankBook Add --");
		
	}
	
	@RequestMapping(value="/bankbook/bankbookAdd", method = RequestMethod.POST)
	public ModelAndView bankbookAdd(BankBookDTO bankBookDTO, ModelAndView modelAndView) throws Exception{
		
		return modelAndView;
		
	}
	
	
	
	//상품 수정
	@RequestMapping(value="/bankbook/bankbookUpdate")
	public void bankbookUpdate(BankBookDTO bankBookDTO) throws Exception{
		
		System.out.println("-- BankBook Update --");
		
	}
	
	@RequestMapping(value="/bankbook/bankbookUpdate", method = RequestMethod.POST)
	public ModelAndView bankbookUpdate(BankBookDTO bankBookDTO, ModelAndView modelAndView) throws Exception{
		
		return modelAndView;
		
	}
	
	
	//상품 삭제
	@RequestMapping(value="/bankbook/bankbookDelete", method = RequestMethod.POST)
	public ModelAndView bankbookDelete(BankBookDTO bankBookDTO, ModelAndView modelAndView) throws Exception{
		
		return modelAndView;
		
	}
	
	
	
	

}
