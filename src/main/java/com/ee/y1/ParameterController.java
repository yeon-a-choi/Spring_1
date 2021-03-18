package com.ee.y1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParameterController {

	
	//GET
	@RequestMapping(value = "/param/param1")
	public String paramTest() {
		
		return "param/param1";
		
	}

	
	//POST
	@RequestMapping(value = "/param/param1", method=RequestMethod.POST)
	public void paramTest2(@RequestParam(defaultValue="100") int p1, String p2, String p3, String p4, String p5, String [] p6) {
		
		//기본값 : defaultValue="기본값" , 사용조건 : p1이라는 파라미터자체가 없을 때 , 앞에 value="이름" 의 이름값 조차 존재하지 않을 때
		
		//파라미터의 이름과 매개변수명이 일치하지 않을 때
		//@RequestParam(value="p1") String p1
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		//checkbox는 vaule가 여러개가 넘어올 수 있기 때문에 배열타입으로 받아서 분류
		for(int i=0; i<p6.length; i++) {
			
			System.out.println(p6[i]);
			
		}
		
	}
	
}
