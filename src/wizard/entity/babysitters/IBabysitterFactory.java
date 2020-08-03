package wizard.entity.babysitters;

import java.io.IOException;

import wizard.entity.Babysitter;

public interface IBabysitterFactory {
	
	
	 Babysitter createBabysitter() throws IOException;

}