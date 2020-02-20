package io.cloudical.cd;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

	@RequestMapping(path="/", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> sayHello(@RequestParam("name") String name) {

		final String response = "Hi, %s!";

		return ResponseEntity.ok("{ \"response\" : \"" + String.format(response, name) + "\" }");
	}


}
