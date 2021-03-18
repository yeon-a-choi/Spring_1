package com.ee.y1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	//Member Join
	
	// memberJoin	// 		/member/memberJoin Get
	// memberJoin2	//		/member/memberJoin Post
	
	//GET
	@RequestMapping(value="/member/memberJoin")
	public String memberJoin(){
		
		System.out.println("-- Join --");
		
		return "/member/memberJoin";
		
	}
	
	//POST
	@RequestMapping(value="/member/memberJoin", method=RequestMethod.POST)
	public void memberJoin2(MemberDTO memberDTO) throws Exception {
						// 파라미터로 받아오는 id, pw, name, phone, email을 위의 타입처럼 변수로 받아올 수 있음!
						// 하나하나 set으로 옮겨오지 않고 memberDTO 하나로 값 모두 set
	
						// 원래는 매개변수로 HttpServletRequest request를 받아옴
						// 원래는 String id = request.getParameter("id");로 받아와야 함
		
		
		int result = memberService.memberJoin(memberDTO);
		
		//result 값이 1이 출력되면 DB에 insert 성공
		System.out.println("result : "+result);
		System.out.println("------------------");
		
		System.out.println("ID : "+memberDTO.getId());
		System.out.println("PW : "+memberDTO.getPw());
		System.out.println("Name : "+memberDTO.getName());
		System.out.println("Phone : "+memberDTO.getPhone());
		System.out.println("Email : "+memberDTO.getEmail());
		
	}
	
	
	
	
	//Member Login
	
	
	//memberJoin print  //url: /member/memberLogin
	@RequestMapping(value="/member/memberLogin")
	public String memberLogin() {
		
		
		//아래의 코드를 매개변수로 받음
		//String name = request.getParameter("name");
		//int age = Integer.parseInt(request.getParameter("age"));
		
		//System.out.println(name);
		//System.out.println(age);
		
		System.out.println("--Login--");
		
		// /WEB-INF/views/memberLogin.jsp의 주소가 보내질 수 있게 리턴값 생각
		
		return "/member/memberLogin";
	}
	
	
	@RequestMapping(value="/member/memberLogin", method=RequestMethod.POST)
	public void memberLogin2(HttpServletRequest request) throws Exception {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		
		memberDTO = memberService.memberLogin(memberDTO);
		
		System.out.println(memberDTO);
		
	}

}
