package model;


public class MedicalChart {
	private int patientID;
	
	private int OMSIndicator;
	private boolean carcinomaE;
	private boolean carcinomaInd;
	private boolean adenocarcinomaI;
	private boolean adenocarcinomaII;
	private int cancerStage;
	private boolean previousRadiotherapy;
	private float distanceToUpperBorder;
	private float pulmonarVolume;
	private boolean activeInfection;
	
	/* Blood */
	private float neutrocytesCount;
	private float plateletsCount;
	private float bilirubinCount;
	private float creatinineCount;;
	
	
	public MedicalChart(int patientID, int oMSIndicator, boolean carcinomaE, boolean carcinomaInd,
			boolean adenocarcinomaI, boolean adenocarcinomaII, int cancerStage, boolean previousRadiotherapy,
			float distanceToUpperBorder, float pulmonarVolume, boolean activeInfection, float neutrocytesCount,
			float plateletsCount, float bilirubinCount, float creatinineCount) {
		super();
		this.patientID = patientID;
		OMSIndicator = oMSIndicator;
		this.carcinomaE = carcinomaE;
		this.carcinomaInd = carcinomaInd;
		this.adenocarcinomaI = adenocarcinomaI;
		this.adenocarcinomaII = adenocarcinomaII;
		this.cancerStage = cancerStage;
		this.previousRadiotherapy = previousRadiotherapy;
		this.distanceToUpperBorder = distanceToUpperBorder;
		this.pulmonarVolume = pulmonarVolume;
		this.activeInfection = activeInfection;
		this.neutrocytesCount = neutrocytesCount;
		this.plateletsCount = plateletsCount;
		this.bilirubinCount = bilirubinCount;
		this.creatinineCount = creatinineCount;
	}


	public int getPatientID() {
		return patientID;
	}


	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}


	public int getOMSIndicator() {
		return OMSIndicator;
	}


	public void setOMSIndicator(int oMSIndicator) {
		OMSIndicator = oMSIndicator;
	}


	public boolean isCarcinomaE() {
		return carcinomaE;
	}


	public void setCarcinomaE(boolean carcinomaE) {
		this.carcinomaE = carcinomaE;
	}


	public boolean isCarcinomaInd() {
		return carcinomaInd;
	}


	public void setCarcinomaInd(boolean carcinomaInd) {
		this.carcinomaInd = carcinomaInd;
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


	public float getPulmonarVolume() {
		return pulmonarVolume;
	}


	public void setPulmonarVolume(float pulmonarVolume) {
		this.pulmonarVolume = pulmonarVolume;
	}


	public boolean isActiveInfection() {
		return activeInfection;
	}


	public void setActiveInfection(boolean activeInfection) {
		this.activeInfection = activeInfection;
	}


	public float getNeutrocytesCount() {
		return neutrocytesCount;
	}


	public void setNeutrocytesCount(float neutrocytesCount) {
		this.neutrocytesCount = neutrocytesCount;
	}


	public float getPlateletsCount() {
		return plateletsCount;
	}


	public void setPlateletsCount(float plateletsCount) {
		this.plateletsCount = plateletsCount;
	}


	public float getBilirubinCount() {
		return bilirubinCount;
	}


	public void setBilirubinCount(float bilirubinCount) {
		this.bilirubinCount = bilirubinCount;
	}


	public float getCreatinineCount() {
		return creatinineCount;
	}


	public void setCreatinineCount(float creatinineCount) {
		this.creatinineCount = creatinineCount;
	}
}
