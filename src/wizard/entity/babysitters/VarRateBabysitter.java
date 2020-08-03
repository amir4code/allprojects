package wizard.entity.babysitters;

import java.io.IOException;

import wizard.entity.Babysitter;
import wizard.entity.calculators.IWageCalculator;

class VarRateBabysitter extends Babysitter {
	
	final short midTimeAfter=0;
	final short midTimeBefore=12;
	
	private int rate1=12;
	private int rate2=8;
	private int rate3=16;	
	
	public void setRate1(int rate1) throws Exception{
		
		if (rate1<0){
			
			throw new Exception("Rate1: The hourly rate cannot have a negative value");
		}
		
		this.rate1=rate1;
	}
	
	public void setRate2(int rate2) throws Exception{
		if (rate2<0){
			
			throw new Exception("Rate2: The hourly rate cannot have a negative value");
		}
		
		this.rate2=rate2;
	}
	
	public void setRate3(int rate3) throws Exception{
		if (rate3<0){
				
				throw new Exception("Rate3: The hourly rate cannot have a negative value");
		}
		this.rate3=rate3;
	}
	
	IWageCalculator wageCalculator=null;
	
	VarRateBabysitter(String firstName, String lastName, IWageCalculator wageCalculator,int rate1,int rate2,int rate3) throws IOException{
		
		this.setfirstName(firstName);
		this.setLastName(lastName);
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Preparing to create new babysitter:"+ firstName +" "+lastName);
		
		try{
		setRate1(rate1);
		setRate2(rate2);
		setRate3(rate3);
		}
		catch (Exception exc){
			
			throw new IOException("Input Error: "+exc.getMessage());
			
		}
		
		System.out.println("A new babysitter has been created:"+ firstName +" "+lastName);
		
		this.wageCalculator=wageCalculator; // ------ Dependency injection ---------
		
	}
	
	public int calculateMyWages(int startTime,int bedTime, int endTime){
		int wagesSum=0;
			
		wagesSum=wageCalculator.calculateWages(startTime,bedTime,endTime,rate1,rate2,rate3);
		
		return (wagesSum);
	}
	

}
