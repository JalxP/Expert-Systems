package model;

import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import model.Patient;

public class Dados {
	
	private ArrayList<Patient> patients;

	private KieSession kSession;
	

	public Dados() {
		
		patients = new ArrayList<>();
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		kSession = kContainer.newKieSession("ksession-rules");
		
		
		/*
		Patient p1 = new Patient("Agente", 58, "M", false, false, 1,
				false, false, false, true,
				true, false, 2, 4, 1.1f,
				25, 1.6f, 150, 1,
				false);
		
		kSession.insert(p1);
		kSession.fireAllRules();
		*/
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
		System.out.println("Num. pacientes registados: " + patients.size());
		
		for (Patient pt : patients)
			kSession.insert(pt);
		
		kSession.fireAllRules();
	}

	
}
