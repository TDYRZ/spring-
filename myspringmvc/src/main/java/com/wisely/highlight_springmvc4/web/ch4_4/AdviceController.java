package com.wisely.highlight_springmvc4.web.ch4_4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisely.highlight_springmvc4.domain.DemoObj;

@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public void getSomething(@ModelAttribute("msg") String msg,DemoObj obj){//1
		
		//throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute:"+ msg);
		
		try {
			int a=0;
			int b=1;
			int c=b/a;
		} catch (Exception e) {
			throw e;
		}
	}

}
