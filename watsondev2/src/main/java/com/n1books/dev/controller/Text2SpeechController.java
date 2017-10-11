package com.n1books.dev.controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

import text_to_speech.Text2SpeechService;

@Controller
public class Text2SpeechController {
	private static final Logger logger = LoggerFactory.getLogger(Text2SpeechController.class);
	@Autowired
	private Text2SpeechService service;
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		return new ModelAndView("hello", "msg", "Hello MVC");
	}
	
	@RequestMapping("display")
	public ModelAndView display_voice() {
		TextToSpeech service = new TextToSpeech(
				"0a3f4d46-2ab1-4b73-ab79-9970543734ce", "MEOCGJkFDFTv");

		List<Voice> voices = service.getVoices().execute();
		return new ModelAndView("hello", "voices", voices);
	}
	
//	@PostMapping("text2speech")
//	@GetMapping("text2speech")
	@RequestMapping(value="text2speech", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView text2speech(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Voice> voices = (List<Voice>) service.getVoiceList();
		return new ModelAndView("text2speech","voices",voices);
	}
	
	@GetMapping("speaker")
	public void speaker(String statement, String voice, HttpServletResponse response) throws Exception {
		logger.info("statement : " + statement);
		logger.info("voice     : " + voice);
		
		response.setContentType("application/octet-stream");
		response.setHeader(
				"Content-Disposition", "attachment;filename=" +
				URLEncoder.encode("voice.ogg","UTF-8"));

		InputStream is = service.getSpeech(statement, voice);
		OutputStream os = response.getOutputStream();
		FileCopyUtils.copy(is, os);
	}
}

