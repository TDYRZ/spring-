package com.wisely.highlight_springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice //1 对于控制器的全局配置放置在同一个位置
public class ExceptionHandlerAdvice { 

	@ExceptionHandler(value = Exception.class)//2在此处定义全局处理，value属性可过滤拦截条件
	public ModelAndView exception(Exception exception, WebRequest request) {
		ModelAndView modelAndView = new ModelAndView("error");// error页面
		modelAndView.addObject("errorMessage", exception.getMessage());
		return modelAndView;
	}

	@ModelAttribute //3将键值对添加到全局
	public void addAttributes(Model model) {
		model.addAttribute("msg", "额外信息"); //3
	}

	@InitBinder //4绑定WebDataBinder
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields("id"); //5
	}
}
