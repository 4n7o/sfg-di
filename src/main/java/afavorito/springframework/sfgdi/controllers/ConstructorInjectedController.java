/**
 * 
 */
package afavorito.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import afavorito.springframework.sfgdi.services.GreetingService;

/**
 * @author A. Favorito on 07-12-2021
 *
 * 
 */
@Controller
public class ConstructorInjectedController {
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();

	}

}
