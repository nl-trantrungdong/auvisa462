package com.example.sbjsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.sbjsp.model.Person;

@Controller
public class MainController {

	private static String status = "false";

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("status", status);
		return "index";
	}
	@GetMapping("/setstatus")
	@ResponseBody
	public String setStatus(@RequestParam("status") String newStatus) {
		status = newStatus;
		return "Status updated to: " + status;
	}
}
