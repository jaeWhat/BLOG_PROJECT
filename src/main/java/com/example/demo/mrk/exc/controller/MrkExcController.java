package com.example.demo.mrk.exc.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MrkExcController {

	private static final Logger logger = LoggerFactory.getLogger(MrkExcController.class);

	@RequestMapping(value = "/mrk/exc", method = RequestMethod.GET)
	public ModelAndView mrkExc() throws IOException {

		logger.info("MrkExcController.mrkExc!");
		ModelAndView mv = new ModelAndView();
		String exchangeTag = "";

		exchangeTag = getExchange();

		mv.addObject("exchangeTag", exchangeTag);
		mv.setViewName("mrk/exc/mrkExcAnl");

		return mv;
	}

	private String getExchange() throws IOException {

		int cnt = 0;
		String resultTag = "";
		String cntyCd = "KRW,USD,JPY,CNY,EUR";
		String[] codeList = cntyCd.split(",");

		for (int i = 0; i < codeList.length; i++) {
			for (int j = i + 1; j < codeList.length; j++, cnt++) {

				String URL = "https://finance.yahoo.com/quote/" + codeList[j] + codeList[i] + "=X" + "?p=" + codeList[j]
						+ codeList[i] + "=X";
				String URL2 = "https://finance.yahoo.com/quote/" + codeList[i] + codeList[j] + "=X" + "?p="
						+ codeList[i] + codeList[j] + "=X";

				Document doc = Jsoup.connect(URL).get();
				Document doc2 = Jsoup.connect(URL2).get();

				Elements elcnty = doc2.select("h1[data-reactid=\"7\"]");
				Elements elPric = doc.select("span[data-reactid=\"34\"]");
				Elements elPric2 = doc2.select("span[data-reactid=\"34\"]");

				String cnty = elcnty.text().substring(0, 7);
				String[] pricList = elPric.text().split(" ");
				String pric = pricList[1];
				String[] pricList2 = elPric2.text().split(" ");
				String pric2 = pricList2[1];

//				Double dPric = Double.parseDouble(pric.replaceAll(",", ""));
//				Double dPric2 = Double.parseDouble(pric2.replaceAll(",", ""));

				resultTag += "<tr><td>" + cnty + "</td><td>" + pric + "</td><td>" + pric2 + "</td></tr>";
			}
		}
		return resultTag;
	}
}
