package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Patient {
	private String name;
	private int age;
	private String gender;
	private boolean lactant;
	private boolean pregnant;
	private int OMSIndicator; //WHOPS
	private boolean carcinomaEspino;
	private boolean carcinomaIndif;
	private boolean adenoI;
	private boolean adenoII;
	private boolean consent;
	private boolean previousRadio;
	private int cancerStage;
	private float borderSup;
	private float neutroCount;
	private float plateletsCount;
	private float biliCount;
	private float creatCount;
	private float pulmonarFunction;
	private boolean activeInfection;
	
	private BooleanProperty accepted = new SimpleBooleanProperty();

	public Patient(String name, int age, String gender, boolean lactant, boolean pregnant, int oMSIndicator,
			boolean carcinomaEspino, boolean carcinomaIndif, boolean adenoI, boolean adenoII,
			boolean consent, boolean previousRadio, int cancerStage, float borderSup, float neutroCount,
			float plateletsCount, float biliCount, float creatCount, float pulmonarFunction,
			boolean activeInfection) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.lactant = lactant;
		this.pregnant = pregnant;
		OMSIndicator = oMSIndicator;
		this.carcinomaEspino = carcinomaEspino;
		this.carcinomaIndif = carcinomaIndif;
		this.adenoI = adenoI;
		this.adenoII = adenoII;
		this.consent = consent;
		this.previousRadio = previousRadio;
		this.cancerStage = cancerStage;
		this.borderSup = borderSup;
		this.neutroCount = neutroCount;
		this.plateletsCount = plateletsCount;
		this.biliCount = biliCount;
		this.creatCount = creatCount;
		this.pulmonarFunction = pulmonarFunction;
		this.activeInfection = activeInfection;
		
		accepted.set(false);
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

	public int getOMSIndicator() {
		return OMSIndicator;
	}

	public void setOMSIndicator(int oMSIndicator) {
		OMSIndicator = oMSIndicator;
	}

	public boolean isCarcinomaEspino() {
		return carcinomaEspino;
	}

	public void setCarcinomaEspino(boolean carcinomaEspino) {
		this.carcinomaEspino = carcinomaEspino;
	}

	public boolean isCarcinomaIndif() {
		return carcinomaIndif;
	}

	public void setCarcinomaIndif(boolean carcinomaIndif) {
		this.carcinomaIndif = carcinomaIndif;
	}

	public boolean isAdenoI() {
		return adenoI;
	}

	public void setAdenoI(boolean adenoI) {
		this.adenoI = adenoI;
	}

	public boolean isAdenoII() {
		return adenoII;
	}

	public void setAdenoII(boolean adenoII) {
		this.adenoII = adenoII;
	}
	
	public boolean isConsent() {
		return consent;
	}
	
	public void setConsent(boolean consent) {
		this.consent = consent;
	}

	public boolean isPreviousRadio() {
		return previousRadio;
	}

	public void setPreviousRadio(boolean previousRadio) {
		this.previousRadio = previousRadio;
	}

	public int getCancerStage() {
		return cancerStage;
	}

	public void setCancerStage(int cancerStage) {
		this.cancerStage = cancerStage;
	}

	public float getBorderSup() {
		return borderSup;
	}

	public void setBorderSup(float borderSup) {
		this.borderSup = borderSup;
	}

	public float getNeutroCount() {
		return neutroCount;
	}

	public void setNeutroCount(float neutroCount) {
		this.neutroCount = neutroCount;
	}

	public float getPlateletsCount() {
		return plateletsCount;
	}

	public void setPlateletsCount(float plateletsCount) {
		this.plateletsCount = plateletsCount;
	}

	public float getBiliCount() {
		return biliCount;
	}

	public void setBiliCount(float biliCount) {
		this.biliCount = biliCount;
	}

	public float getCreatCount() {
		return creatCount;
	}

	public void setCreatCount(float creatCount) {
		this.creatCount = creatCount;
	}

	public float getPulmonarFunction() {
		return pulmonarFunction;
	}

	public void setPulmonarFunction(float pulmonarFunction) {
		this.pulmonarFunction = pulmonarFunction;
	}

	public boolean isActiveInfection() {
		return activeInfection;
	}

	public void setActiveInfection(boolean activeInfection) {
		this.activeInfection = activeInfection;
	}

	public boolean getAccepted() {
		return accepted.getValue();
	}

	public void setAccepted(boolean accepted) {
		this.accepted.set(accepted);
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", lactant=" + lactant + ", pregnant="
				+ pregnant + ", OMSIndicator=" + OMSIndicator + ", carcinomaEspino=" + carcinomaEspino
				+ ", carcinomaIndif=" + carcinomaIndif + ", adenoI=" + adenoI + ", adenoII=" + adenoII
				+ ", previousRadio=" + previousRadio + ", cancerStage=" + cancerStage + ", borderSup=" + borderSup
				+ ", neutroCount=" + neutroCount + ", plateletsCount=" + plateletsCount + ", biliCount=" + biliCount
				+ ", creatCount=" + creatCount + ", pulmonarFunction=" + pulmonarFunction + ", activeInfection="
				+ activeInfection + ", accepted=" + accepted + "]";
	}
	
	
	
}
