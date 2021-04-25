package com.jatin.fullstack.template;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
