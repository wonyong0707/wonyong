package com.choa.t1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="/test2.do",method=RequestMethod.GET) //get은 get방식 or post방식
	public String t2(){
		return "test2";
	}
}
