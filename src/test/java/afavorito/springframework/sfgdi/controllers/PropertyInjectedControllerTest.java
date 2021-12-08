/**
 * 
 */
package afavorito.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import afavorito.springframework.sfgdi.services.ConstructorGreetingService;

/**
 * @author A. Favorito on 07-12-2021
 *
 * 
 */
class PropertyInjectedControllerTest {
	/**
	 * 
	 */
	PropertyInjectedController controller;


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());

	}

}
