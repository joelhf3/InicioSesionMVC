package dad.javafx.inicioSesion;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class App extends Application {
	
	private Controlador controlador;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
			
		controlador = new Controlador();
		
		Scene scene = new Scene(controlador.getVista(), 320, 200);
		
		Stage stage = new Stage();
		stage.setTitle("Inicio de Sesión");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}