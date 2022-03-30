package springsecurity.database.spring.database.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeClass {
	
	@RequestMapping("/")
	
	public String home() {
		return("<h1>Hello</h1>");
	}
// 3 . configuring authorization 	
	
	@RequestMapping("/student")
	public String student() {
		return("<h1>Hello student</h1>");
	}
	
	@RequestMapping("/mentor")
	public String mentor() {
		return("<h1>Hello mentor</h1>");
	}
	

}