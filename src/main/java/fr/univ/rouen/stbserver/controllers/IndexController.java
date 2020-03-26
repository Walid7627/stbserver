package fr.univ.rouen.stbserver.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.STB;
@RestController
public class IndexController {
	@GetMapping("/")
	public String index() {
		return"Hello there !";
	}
}