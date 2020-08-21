package viewController;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Dados;
import model.Patient;

public class ViewController implements Initializable  {
	private Dados dados;
	
	/* Tabs */
	@FXML
	private Tab tabInsertData;
	@FXML
	private Tab tabResults;
	
	/* Labels */
	@FXML
	private Label labelInfo;

	/* Buttons */
	@FXML
	private Button buttonAdd;
	
	/* TextFields */
	@FXML
	private TextField textFieldName;
	@FXML
	private TextField textFieldAge;
	@FXML
	private TextField textFieldOMS;
	@FXML
	private TextField textFieldCancerStage;
	@FXML
	private TextField textFieldBordaSup;
	@FXML
	private TextField textFieldNeutro;
	@FXML
	private TextField textFieldPlaquetas;
	@FXML
	private TextField textFieldBili;
	@FXML
	private TextField textFieldCreat;
	@FXML
	private TextField textFieldFuncaoPulm;
	
	/* CheckBoxes */
	@FXML
	private CheckBox checkBoxLactant;
	@FXML
	private CheckBox checkBoxPregnant;
	@FXML
	private CheckBox checkBoxConsent;
	@FXML
	private CheckBox checkBoxPreviousRadiotherapy;
	@FXML
	private CheckBox checkBoxInfection;
	
	/* RadioButtons */
	@FXML
	private RadioButton radioMale;
	@FXML
	private RadioButton radioFemale;
	@FXML
	private RadioButton radioCarcinomaEspinocelular;
	@FXML
	private RadioButton radioCarcinomaIndiferenciado;
	@FXML
	private RadioButton radioAdenoSiewertI;
	@FXML
	private RadioButton radioAdenoSiewertII;
	
	/* Other */
	private ToggleGroup toggleGroupGender;
	private ToggleGroup toggleGroupDiagnosis;
	
	private List<TextField> textFields;
	
	public ViewController(Dados dados) {
		this.dados = dados;
		
		toggleGroupGender = new ToggleGroup();
		toggleGroupDiagnosis = new ToggleGroup();
		textFields = new ArrayList<>();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		/* Set Toggle Groups */
		radioMale.setToggleGroup(toggleGroupGender);
		radioFemale.setToggleGroup(toggleGroupGender);
		
		radioCarcinomaEspinocelular.setToggleGroup(toggleGroupDiagnosis);
		radioCarcinomaIndiferenciado.setToggleGroup(toggleGroupDiagnosis);
		radioAdenoSiewertI.setToggleGroup(toggleGroupDiagnosis);
		radioAdenoSiewertII.setToggleGroup(toggleGroupDiagnosis);
		
		/* Bind Properties */
		checkBoxLactant.disableProperty().bind(radioMale.selectedProperty());
		checkBoxPregnant.disableProperty().bind(radioMale.selectedProperty());
		
		/* Utility */
		textFields.addAll(Arrays.asList(textFieldName, textFieldAge, textFieldOMS,
				textFieldCancerStage, textFieldBordaSup, textFieldNeutro,
				textFieldPlaquetas, textFieldBili, textFieldCreat, textFieldFuncaoPulm));
		
		/* Prompts */
		textFieldName.setPromptText("Nome");
		textFieldAge.setPromptText("Idade");
		textFieldOMS.setPromptText("Indicador OMS");
		textFieldCancerStage.setPromptText("Estágio do Cancro");
		textFieldBordaSup.setPromptText("Borda Superior do Tumor");
		textFieldNeutro.setPromptText("Contagem de Neutrófilos");
		textFieldPlaquetas.setPromptText("Contagem de Plaquetas");
		textFieldBili.setPromptText("Contagem de Bilirrubina");
		textFieldCreat.setPromptText("Contagem de Creatinina");
		textFieldFuncaoPulm.setPromptText("Função Pulmonar (em L)");
		
		
		setupListeners();
	}
	
	private void setupListeners() {
		
		buttonAdd.setOnAction((evt) -> {
			addPatient();
		});
		
		BooleanBinding bb = new BooleanBinding() {
		    {
		    	for (TextField tf : textFields) {
		    		super.bind(tf.textProperty());
		    	}
		    	super.bind(toggleGroupGender.selectedToggleProperty());
		    	super.bind(toggleGroupDiagnosis.selectedToggleProperty());

		    	super.bind(checkBoxPreviousRadiotherapy.selectedProperty());
		    	super.bind(checkBoxConsent.selectedProperty());
		    	super.bind(checkBoxInfection.selectedProperty());
		    }

		    @Override
		    protected boolean computeValue() {
		    	for (TextField tf : textFields) {
		    		if (tf.getText().isEmpty())
		    			return true;
		    	}
		    	
		    	if (toggleGroupDiagnosis.getSelectedToggle() == null ||
		    			toggleGroupGender.getSelectedToggle() == null)
		    		return true;
		    	
		    	return false;
		    }
		};
		buttonAdd.disableProperty().bind(bb);
		
	}
	
	private void addPatient() {
		if (checkUserInput()) {
			
			String name = textFieldName.getText();
			int age = Integer.parseInt(textFieldAge.getText());
			String gender = radioMale.isSelected() ? "M" : "F";
			boolean lactant = checkBoxLactant.isSelected();
			boolean pregnant = checkBoxPregnant.isSelected();
			if (gender.equals("M") ) {
				lactant = false;
				pregnant = false;
			}
			int indicatorOMS = Integer.parseInt(textFieldOMS.getText());
			boolean carciEspino = radioCarcinomaEspinocelular.isSelected();
			boolean carciIndif = radioCarcinomaIndiferenciado.isSelected();
			boolean adenoI = radioAdenoSiewertI.isSelected();
			boolean adenoII = radioAdenoSiewertII.isSelected();
			boolean consent = checkBoxConsent.isSelected();
			boolean previousRadio = checkBoxPreviousRadiotherapy.isSelected();
			int cancerStage = Integer.parseInt(textFieldCancerStage.getText());
			float bordaSup = Float.parseFloat(textFieldBordaSup.getText());
			float neutroCount = Float.parseFloat(textFieldNeutro.getText());
			float plaquetasCount = Float.parseFloat(textFieldPlaquetas.getText());
			float biliCount = Float.parseFloat(textFieldBili.getText());
			float creatCount = Float.parseFloat(textFieldCreat.getText());
			float pulmonaryFunction = Float.parseFloat(textFieldFuncaoPulm.getText());
			boolean activeInfection = checkBoxInfection.isSelected();
			
			Patient p = new Patient(name, age, gender, lactant, pregnant, indicatorOMS,
					carciEspino, carciIndif, adenoI, adenoII, consent, previousRadio,
					cancerStage, bordaSup, neutroCount, plaquetasCount, biliCount,
					creatCount, pulmonaryFunction, activeInfection);
			
			dados.addPatient(p);
		}
	}

	private boolean checkUserInput() {
		
		boolean invalid = false;
		
		String name = textFieldName.getText();
		if (name.isEmpty() || name.matches(".*\\d+.*")) {
			// INVALID NAME
			textFieldName.setStyle("-fx-text-box-border: #FF0000;");
			invalid = true;
		}
		else {
			textFieldName.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
		}
		
		int age;
		try {
			age = Integer.parseInt(textFieldAge.getText());
			if (age < 0) throw new NumberFormatException();
			else {
				textFieldAge.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid Age
			textFieldAge.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		int indicatorOMS;
		try {
			indicatorOMS = Integer.parseInt(textFieldOMS.getText());
			if (indicatorOMS < 0 || indicatorOMS > 5) throw new NumberFormatException();
			else {
				textFieldOMS.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid OMS indicator
			textFieldOMS.setStyle("-fx-text-box-border: #FF0000;");
		}

		int cancerStage;
		try {
			cancerStage = Integer.parseInt(textFieldCancerStage.getText());
			if (cancerStage < 0 || cancerStage > 4) throw new NumberFormatException();
			else {
				textFieldCancerStage.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid cancer stage
			textFieldCancerStage.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		float bordaSup;
		try {
			bordaSup = Float.parseFloat(textFieldBordaSup.getText());
			if (bordaSup < 0) throw new NumberFormatException();
			else {
				textFieldBordaSup.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid Superior Border
			textFieldBordaSup.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		float neutroCount;
		try {
			neutroCount = Float.parseFloat(textFieldNeutro.getText());
			if (neutroCount < 0) throw new NumberFormatException();
			else {
				textFieldNeutro.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid Neutro Count
			textFieldNeutro.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		float plaquetasCount;
		try {
			plaquetasCount = Float.parseFloat(textFieldPlaquetas.getText());
			if (plaquetasCount < 0) throw new NumberFormatException();
			else {
				textFieldPlaquetas.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid Plaquetas Count
			textFieldPlaquetas.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		float biliCount;
		try {
			biliCount = Float.parseFloat(textFieldBili.getText());
			if (biliCount < 0) throw new NumberFormatException();
			else {
				textFieldBili.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid Bili Count
			textFieldBili.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		float creatCount;
		try {
			creatCount = Float.parseFloat(textFieldCreat.getText());
			if (creatCount < 0) throw new NumberFormatException();
			else {
				textFieldCreat.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid Creat Count
			textFieldCreat.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		float pulmonaryFunction;
		try {
			pulmonaryFunction = Float.parseFloat(textFieldFuncaoPulm.getText());
			if (pulmonaryFunction < 0) throw new NumberFormatException();
			else {
				textFieldFuncaoPulm.setStyle("-fx-text-box-border: #000000; -fx-border-radius: 3px");
			}
		} catch (NumberFormatException e) {
			// Invalid Superior Border
			textFieldFuncaoPulm.setStyle("-fx-text-box-border: #FF0000;");
		}
		
		
		
		if (invalid) {
			labelInfo.setText("Verifique os Campos Assinalados");
		}
		return !invalid;
	}
}
