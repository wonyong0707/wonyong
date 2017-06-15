package com.choa.t1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.choa.notice.NoticeDTO;

@Controller
@RequestMapping(value="/notice/")
public class Test2Controller {

	@RequestMapping(value="noticeWrite", method=RequestMethod.GET)
	public void te2(){
	}
	
	
	@RequestMapping(value="noticeProcess", method=RequestMethod.POST)
	public ModelAndView t1(Model model, String writer){
		
		
		System.out.println("들어왔습니다~");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("notice/noticeView"); // view의 경로
		modelAndView.addObject("message", "hello~");
		return modelAndView;
	}
}
