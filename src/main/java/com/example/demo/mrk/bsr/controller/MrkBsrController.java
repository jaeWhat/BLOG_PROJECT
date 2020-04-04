package com.example.demo.mrk.bsr.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MrkBsrController {

	private static final Logger logger = LoggerFactory.getLogger(MrkBsrController.class);

	@RequestMapping(value = "/mrk/bsr", method = RequestMethod.GET)
	public ModelAndView mrkExc() throws IOException {

		logger.info("MrkExcController.mrkBsr!");
		ModelAndView mv = new ModelAndView();
		String baseRateTag = "";

		mv.addObject("baseRateTag", baseRateTag);
		mv.setViewName("mrk/bsr/mrkBsrAnl");

		return mv;
	}
}
