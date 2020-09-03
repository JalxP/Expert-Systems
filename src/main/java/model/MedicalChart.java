package model;


public class MedicalChart {
	private int patientID;
	
	private int whoStatus;
	private boolean squamousCellCarcinoma;
	private boolean undifferentiatedCarcinoma;
	private boolean adenocarcinomaI;
	private boolean adenocarcinomaII;
	private int cancerStage;
	private boolean previousRadiotherapy;
	private float distanceToUpperBorder;
	private float pulmonaryFunction;
	private boolean activeInfection;
	
	/* Blood */	
	private float neutrophils;
	private float platelets;
	private float bilirubin;
	private float creatinine;
	
	/* Detected Problems */
	private boolean respiratoryTreeAffected;
	private boolean endoscopicLesions;
	
	
	public MedicalChart(int patientID, int oMSIndicator, boolean carcinomaE, boolean carcinomaInd,
			boolean adenocarcinomaI, boolean adenocarcinomaII, int cancerStage, boolean previousRadiotherapy,
			float distanceToUpperBorder, float pulmonarVolume, boolean activeInfection, float neutrocytesCount,
			float plateletsCount, float bilirubinCount, float creatinineCount,
			boolean respiratoryTreeAffected, boolean endoscopicLesions) {
		super();
		this.patientID = patientID;
		whoStatus = oMSIndicator;
		this.squamousCellCarcinoma = carcinomaE;
		this.undifferentiatedCarcinoma = carcinomaInd;
		this.adenocarcinomaI = adenocarcinomaI;
		this.adenocarcinomaII = adenocarcinomaII;
		this.cancerStage = cancerStage;
		this.previousRadiotherapy = previousRadiotherapy;
		this.distanceToUpperBorder = distanceToUpperBorder;
		this.pulmonaryFunction = pulmonarVolume;
		this.activeInfection = activeInfection;
		this.neutrophils = neutrocytesCount;
		this.platelets = plateletsCount;
		this.bilirubin = bilirubinCount;
		this.creatinine = creatinineCount;
		this.respiratoryTreeAffected = respiratoryTreeAffected;
		this.endoscopicLesions = endoscopicLesions;
	}


	public int getPatientID() {
		return patientID;
	}


	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}


	public int getWhoStatus() {
		return whoStatus;
	}


	public void setWhoStatus(int whoStatus) {
		this.whoStatus = whoStatus;
	}


	public boolean isSquamousCellCarcinoma() {
		return squamousCellCarcinoma;
	}


	public void setSquamousCellCarcinoma(boolean squamousCellCarcinoma) {
		this.squamousCellCarcinoma = squamousCellCarcinoma;
	}


	public boolean isUndifferentiatedCarcinoma() {
		return undifferentiatedCarcinoma;
	}


	public void setUndifferentiatedCarcinoma(boolean undifferentiatedCarcinoma) {
		this.undifferentiatedCarcinoma = undifferentiatedCarcinoma;
	}


	public boolean isAdenocarcinomaI() {
		return adenocarcinomaI;
	}


	public void setAdenocarcinomaI(boolean adenocarcinomaI) {
		this.adenocarcinomaI = adenocarcinomaI;
	}


	public boolean isAdenocarcinomaII() {
		return adenocarcinomaII;
	}


	public void setAdenocarcinomaII(boolean adenocarcinomaII) {
		this.adenocarcinomaII = adenocarcinomaII;
	}


	public int getCancerStage() {
		return cancerStage;
	}


	public void setCancerStage(int cancerStage) {
		this.cancerStage = cancerStage;
	}


	public boolean isPreviousRadiotherapy() {
		return previousRadiotherapy;
	}


	public void setPreviousRadiotherapy(boolean previousRadiotherapy) {
		this.previousRadiotherapy = previousRadiotherapy;
	}


	public float getDistanceToUpperBorder() {
		return distanceToUpperBorder;
	}


	public void setDistanceToUpperBorder(float distanceToUpperBorder) {
		this.distanceToUpperBorder = distanceToUpperBorder;
	}


	public float getPulmonaryFunction() {
		return pulmonaryFunction;
	}


	public void setPulmonaryFunction(float pulmonaryFunction) {
		this.pulmonaryFunction = pulmonaryFunction;
	}


	public boolean isActiveInfection() {
		return activeInfection;
	}


	public void setActiveInfection(boolean activeInfection) {
		this.activeInfection = activeInfection;
	}


	public float getNeutrophils() {
		return neutrophils;
	}


	public void setNeutrophils(float neutrophils) {
		this.neutrophils = neutrophils;
	}


	public float getPlatelets() {
		return platelets;
	}


	public void setPlatelets(float platelets) {
		this.platelets = platelets;
	}


	public float getBilirubin() {
		return bilirubin;
	}


	public void setBilirubin(float bilirubin) {
		this.bilirubin = bilirubin;
	}


	public float getCreatinine() {
		return creatinine;
	}


	public void setCreatinine(float creatinine) {
		this.creatinine = creatinine;
	}


	public boolean isRespiratoryTreeAffected() {
		return respiratoryTreeAffected;
	}


	public void setRespiratoryTreeAffected(boolean respiratoryTreeAffected) {
		this.respiratoryTreeAffected = respiratoryTreeAffected;
	}


	public boolean isEndoscopicLesions() {
		return endoscopicLesions;
	}


	public void setEndoscopicLesions(boolean endoscopicLesions) {
		this.endoscopicLesions = endoscopicLesions;
	}

	
}