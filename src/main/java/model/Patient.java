package model;

import javafx.beans.property.SimpleStringProperty;

public class Patient {
	
	private static int id = 0;
	
	private final int patientID;
	private String name;
	private int age;
	private String gender;
	private boolean lactant;
	private boolean pregnant;
	private boolean consent;
	
	private boolean accepted;
	
	/* Results */
	private SimpleStringProperty results = new SimpleStringProperty();
	

	public Patient(String name, int age, String gender, boolean lactant, boolean pregnant, boolean consent) {
		super();
		this.patientID = id++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.lactant = lactant;
		this.pregnant = pregnant;
		this.consent = consent;
		this.accepted = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isLactant() {
		return lactant;
	}

	public void setLactant(boolean lactant) {
		this.lactant = lactant;
	}

	public boolean isPregnant() {
		return pregnant;
	}

	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}

	public boolean isConsent() {
		return consent;
	}

	public void setConsent(boolean consent) {
		this.consent = consent;
	}

	public boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public int getPatientID() {
		return patientID;
	}

	public SimpleStringProperty getResultsProperty() {
		return results;
	}

	public String getResults() {
		return results.get();
	}
	
	public void setResults(String results) {
		this.results.set(results);
	}
	
	
}
