package wizard.entity;

public abstract class Babysitter {
	
	private String firstName;
	
	private String lastName;
	
	protected String getFirstName() {
		
		return firstName;
	}
	
	protected void setfirstName(String firstName){
		
		this.firstName=firstName;
	}
	
	protected String getLastName() {
			
		return lastName;
	}
		
	protected void setLastName(String lastName){
		
		this.lastName=lastName;
	}

	
	
	public abstract int calculateMyWages(int startTime,int bedTime, int endTime);
}

