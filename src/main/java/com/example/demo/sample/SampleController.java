package com.example.demo.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping(value = "/smp/lgn.do", method = RequestMethod.GET)
	public String smpLgn() {
		logger.info("Welcome /smp/lgn.do!");
		return "smp/login";
	}
	
	@RequestMapping(value = "/smp/register.do", method = RequestMethod.GET)
	public String smpRegister() {
		logger.info("Welcome /smp/register.do!");
		return "smp/register";
	}
	
	@RequestMapping(value = "/smp/forgetPassword.do", method = RequestMethod.GET)
	public String smpforgetPassword() {
		logger.info("Welcome /smp/register.do!");
		return "smp/forgot-password";
	}
	
	@RequestMapping(value = "/smp/404.do", method = RequestMethod.GET)
	public String smp404() {
		logger.info("Welcome /smp/404.do!");
		return "smp/404";
	}
	
	@RequestMapping(value = "/smp/blank.do", method = RequestMethod.GET)
	public String smpBlank() {
		logger.info("Welcome /smp/blank.do!");
		return "smp/blank";
	}
	
	@RequestMapping(value = "/smp/button.do", method = RequestMethod.GET)
	public String smpButton() {
		logger.info("Welcome /smp/button.do!");
		return "smp/button";
	}
	
	@RequestMapping(value = "/smp/cards.do", method = RequestMethod.GET)
	public String smpCards() {
		logger.info("Welcome /smp/cards.do!");
		return "smp/cards";
	}
	
	@RequestMapping(value = "/smp/utilitiesColor.do", method = RequestMethod.GET)
	public String smpUtilitiesColor() {
		logger.info("Welcome /smp/utilitiesColor.do!");
		return "smp/utilities-color";
	}
	
	@RequestMapping(value = "/smp/utilitiesBorder.do", method = RequestMethod.GET)
	public String smpUtilitiesBorder() {
		logger.info("Welcome /smp/utilitiesBorder.do!");
		return "smp/utilities-border";
	}
	
	@RequestMapping(value = "/smp/utilitiesAnimation.do", method = RequestMethod.GET)
	public String smpUtilitiesAnimation() {
		logger.info("Welcome /smp/utilitiesAnimation.do!");
		return "smp/utilities-animation";
	}
	
	@RequestMapping(value = "/smp/utilitiesOther.do", method = RequestMethod.GET)
	public String smpUtilitiesOther() {
		logger.info("Welcome /smp/utilitiesOther.do!");
		return "smp/utilities-other";
	}
	
	@RequestMapping(value = "/smp/tables.do", method = RequestMethod.GET)
	public String smpTables() {
		logger.info("Welcome /smp/tables.do!");
		return "smp/tables";
	}
	@RequestMapping(value = "/smp/charts.do", method = RequestMethod.GET)
	public String smpCharts() {
		logger.info("Welcome /smp/charts.do!");
		return "smp/charts";
	}
}
