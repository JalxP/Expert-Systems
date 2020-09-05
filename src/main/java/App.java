
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Dados;
import viewController.ViewController;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ui.fxml"));
        fxmlLoader.setController(new ViewController(new Dados()));

		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);
		stage.setTitle("Trabalho Prático de Conhecimento e Raciocínio – 2019/2020 – v1.0");
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}
