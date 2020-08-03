package wizard.entity.babysitters;

import java.io.IOException;

import wizard.entity.Babysitter;

public class FactoryUtil {
	
	
	public static Babysitter generateBabysitter(IBabysitterFactory babysitterFactory) throws IOException{
		return babysitterFactory.createBabysitter();
	}

}

