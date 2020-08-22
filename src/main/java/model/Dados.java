package model;

import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Dados {
	
	private ArrayList<Patient> patients;
	private ArrayList<MedicalChart> medicalCharts;

	private KieSession kSession;
	

	public Dados() {
		
		patients = new ArrayList<>();
		medicalCharts = new ArrayList<>();
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		kSession = kContainer.newKieSession("ksession-rules");
	}
	
	public void add(Patient p, MedicalChart m) {
		patients.add(p);
		medicalCharts.add(m);
		
		kSession.insert(p);
		kSession.insert(m);
		
		kSession.fireAllRules();
	}
}
