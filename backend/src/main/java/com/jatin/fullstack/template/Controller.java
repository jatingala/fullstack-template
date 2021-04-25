package com.jatin.fullstack.template;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.HEAD;
import static org.springframework.web.bind.annotation.RequestMethod.OPTIONS;
import static org.springframework.web.bind.annotation.RequestMethod.PATCH;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.web.bind.annotation.RequestMethod.TRACE;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;

@RestController
@CrossOrigin(origins = CorsConfiguration.ALL, methods = { GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE })
public class Controller {

	@GetMapping("/public")
	public String getPublic() {
		return "public success!";
	}

	@GetMapping("/private")
	public String getPrivate(@AuthenticationPrincipal Jwt jwt) {
		return "private";
	}

}
