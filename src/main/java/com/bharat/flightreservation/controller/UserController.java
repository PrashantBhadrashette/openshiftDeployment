package com.bharat.flightreservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bharat.flightreservation.entities.User;
import com.bharat.flightreservation.repos.UserRepository;
import com.bharat.flightreservation.service.SecurityService;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SecurityService securityService;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	private BCryptPasswordEncoder encoder;

	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		user.setPASSWORD(encoder.encode(user.getPASSWORD()));
		userRepository.save(user);
		return "login/login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String email, String password, ModelMap modelMap) {

		LOGGER.error("ERROR");
		LOGGER.warn("WARN");
		LOGGER.info("INFO");
		LOGGER.debug("DEBUG");
		LOGGER.trace("TRACE");

		boolean loginResponse = securityService.login(email, password);

		if (loginResponse) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "username or password is wrong ,please check and try again...");
		}

		return "login/login";
	}

}
