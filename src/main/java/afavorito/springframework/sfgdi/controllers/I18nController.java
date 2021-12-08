/**
 * 
 */
package afavorito.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import afavorito.springframework.sfgdi.services.GreetingService;

/**
 * @author A. Favorito on 08-12-2021
 *
 * 
 */
@Controller
public class I18nController {
	private final GreetingService greetingService;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;

	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}


}
