/**
 * 
 */
package afavorito.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author A. Favorito on 08-12-2021
 *
 * 
 */
@Profile({ "ES", "default" })
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hola Mundo - ES";
	}
	

}
