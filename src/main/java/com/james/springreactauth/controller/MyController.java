package com.james.springreactauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.james.springreactauth.entity.User;
import com.james.springreactauth.repository.UserRepository;

@Controller
public class MyController {

	@Autowired
	UserRepository repo;

	@RequestMapping(value = { "/", "/login", "/register" })
	public String index() {
		return "index.html";
	}

	@PostMapping("/register")
	public String save(@ModelAttribute User user) {
		try {
			repo.save(user);
		} catch (Exception e) {
			return "redirect:/register?error";
		}
		return "redirect:/";
	}
}