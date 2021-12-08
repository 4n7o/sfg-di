/**
 * 
 */
package afavorito.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author A. Favorito on 07-12-2021
 *
 * 
 */
@Service
public class ConstructorGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Setter";
	}

}
