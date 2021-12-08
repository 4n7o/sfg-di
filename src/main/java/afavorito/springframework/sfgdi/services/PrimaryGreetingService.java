/**
 * 
 */
package afavorito.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author A. Favorito on 08-12-2021
 *
 * 
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World - From the Primary Bean";
	}
}
