package helse;

public interface Employee {
	
	void medicate(Patient patient, Medication medication);
	Hospital getEmployer();
	
	void setAvailable(boolean isAvailable);
	boolean isAvailable();

}
