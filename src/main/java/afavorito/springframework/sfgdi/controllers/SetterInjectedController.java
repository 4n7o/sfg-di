/**
 * 
 */
package afavorito.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import afavorito.springframework.sfgdi.services.GreetingService;

/**
 * @author A. Favorito on 07-12-2021
 *
 * 
 */
@Controller
public class SetterInjectedController {
	private GreetingService greetingService;

	@Qualifier("setterGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
