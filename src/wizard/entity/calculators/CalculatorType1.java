package wizard.entity.calculators;

public class CalculatorType1 implements IWageCalculator{
	
	public int calculateWages(int startTime,int bedTime, int endTime, int rate1, int rate2, int rate3){
		
		int wagesSum=0;
		int sumRate1,sumRate2, sumRate3;
		
		final short midTimeAfter=0;
		final short midTimeBefore=12;
		
		final int allowedStartTime=5;
		final int allowedEndTime=4;
		
		int computedStartTime=startTime;
		int computedBedTime=bedTime;
		int computedEndTime=endTime;
		
		System.out.println("Recorded Start Time:" + startTime);
		System.out.println("Recorded Bed Time:" + bedTime);
		System.out.println("Recorded End Time:" + endTime);
		
		// -----------  Work Hours Rules ------------------
		
		if (startTime<5){
			
			computedStartTime=allowedStartTime;  // The babysitter starts no earlier than 5:00PM
			System.out.println("Adjusted Start Time:" + computedStartTime);
			
		}
		if (endTime>4){
			
			computedEndTime=allowedEndTime; // The babysitter must leave at 4:00AM
			System.out.println("Adjusted End Time:" + computedEndTime);
			
		}
		
		// ------------ Wages by Rates -----------
		sumRate1=(bedTime-computedStartTime)*rate1;
		//System.out.println("Sum1:"+sumRate1);
		sumRate2=(midTimeBefore-computedBedTime)*rate2;	
		//System.out.println("Sum2:"+sumRate2);
		sumRate3=(computedEndTime-midTimeAfter)*rate3;
		//System.out.println("Sum3:"+sumRate3);
		
		wagesSum=sumRate1+sumRate2+sumRate3;
		
		
		return (wagesSum);
	}
	

}
