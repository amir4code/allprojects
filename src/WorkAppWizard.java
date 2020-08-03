import java.text.DecimalFormat;

import wizard.entity.Babysitter;
import wizard.entity.babysitters.FactoryUtil;
import wizard.entity.babysitters.VarRateBabysitterFactory;

public class WorkAppWizard {

	public static void main(String[] args)  {

		System.out.println("Babysitter Wizard - This solution was created by Amir Golan 2020 ");
		/********************************************************************************************************
		 This program calculates the nightly charge for a babysitter work.
		 The program expects to receive three rates as specified in the Babysitter Kata challenge.
		 Please note that these rates can be easily changed by passing different values to the VarRateBabysitterFactory constructor.
		 If the rate value is not a positive number, the program will escalate with the right message.
		 When needed, the code will adjust the start time and end time to reflect the work schedule requirements
		 The nightly charge is computed by using a calculator object which is injected into the Babysitter constructor. 
		 The program was designed with code flexibility in mind. 
		 	
		*********************************************************************************************************/
		int wages=0;
		
		try {
		Babysitter babysitter1=FactoryUtil.generateBabysitter(new VarRateBabysitterFactory("Jane","Johns",12,8,16));
		wages=babysitter1.calculateMyWages(3,9,2); // start time, bed time , end time
		System.out.println("The nighlty charge: " +DecimalFormat.getCurrencyInstance().format(wages));
		}
		catch(Exception exc){
			
			System.out.println("Input Error:" +exc.getMessage());
		}
		try {
		Babysitter babysitter2=FactoryUtil.generateBabysitter(new VarRateBabysitterFactory("Mary","Smith",-12,8,16));
		wages=babysitter2.calculateMyWages(6,9,7); // start time, bed time , end time
		System.out.println("The nighlty charge: " +DecimalFormat.getCurrencyInstance().format(wages));
		}
		catch(Exception exc){
			
			System.out.println("Input Error:" +exc.getMessage());
		}
		try {
		Babysitter babysitter3=FactoryUtil.generateBabysitter(new VarRateBabysitterFactory("Ann","Black",12,8,16));
		wages=babysitter3.calculateMyWages(6,9,7); // start time, bed time , end time
		System.out.println("The nighlty charge: " +DecimalFormat.getCurrencyInstance().format(wages));
		}
		catch(Exception exc){
			
			System.out.println("Input Error:" +exc.getMessage());
		}
		try {
			Babysitter babysitter4=FactoryUtil.generateBabysitter(new VarRateBabysitterFactory("Jack","Pike",12,8,16));
			wages=babysitter4.calculateMyWages(5,10,4); // start time, bed time , end time
			System.out.println("The nighlty charge: " +DecimalFormat.getCurrencyInstance().format(wages));
			}
			catch(Exception exc){
				
				System.out.println("Input Error:" +exc.getMessage());
			}
						
		System.out.println("-------------------------End of Babysitter Wizard----------------------------");
	}

}
