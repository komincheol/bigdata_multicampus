package com.n1books.dev.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Controller
public class Text2SpeechController {
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		return new ModelAndView("hello","msg","Hello MVC");
	}
	@RequestMapping("display")
	public ModelAndView display_voice() {
		TextToSpeech service = new TextToSpeech(
				"44a28ce7-cd02-4b5b-b9e9-94b480db90de", "aSMDNkocUjMl");

		List<Voice> voices = service.getVoices().execute();
		return new ModelAndView("hello", "voices", voices);
		
	}

}
