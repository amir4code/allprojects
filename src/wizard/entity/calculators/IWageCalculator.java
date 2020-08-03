package wizard.entity.calculators;

public interface IWageCalculator {
	
	public int calculateWages(int startTime,int bedTime, int endTime, int rate1, int rate2, int rate3);

}

