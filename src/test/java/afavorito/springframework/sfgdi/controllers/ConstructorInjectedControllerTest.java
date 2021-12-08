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
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
		;
	}

}
