package wizard.entity.babysitters;

import java.io.IOException;

import wizard.entity.Babysitter;
import wizard.entity.calculators.CalculatorType1;


public class VarRateBabysitterFactory implements IBabysitterFactory {
	
	String firstName;
	String lastName;
	int rate1;
	int rate2;
	int rate3;
		
	public VarRateBabysitterFactory(String firstName,String lastName,int rate1,int rate2,int rate3){
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.rate1=rate1;
		this.rate2=rate2;
		this.rate3=rate3;
	}
	
	public Babysitter createBabysitter() throws IOException{
		
		 CalculatorType1 wageCalculator=new CalculatorType1(); // Inject CalculatorType1 
			
		return new VarRateBabysitter(firstName, lastName,wageCalculator,rate1,rate2,rate3);
			
	}

		

}
