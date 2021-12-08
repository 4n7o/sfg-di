/**
 * 
 */
package afavorito.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import afavorito.springframework.sfgdi.services.GreetingService;

/**
 * @author A. Favorito on 07-12-2021
 *
 * 
 */
@Controller
public class MyController {
	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
