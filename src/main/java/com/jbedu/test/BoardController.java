package com.jbedu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //컨트롤러 클래스 임을 명시함
public class BoardController {

	@RequestMapping(value = "/test")  // 요청은 unique 해야함. 중복 불가
	public String test() {
		return "hello"; //클라이언트에게 보내줄 jsp의 이름
	}
}
