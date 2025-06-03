package com.anurag.springboot_github_action_without_database;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

	@RequestMapping("/test")
	public String test() {
		return "Test successfull";
	}
}
