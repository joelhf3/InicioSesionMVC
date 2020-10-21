package dad.javafx.inicioSesion;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Vista extends GridPane {

	private Label lblNombre, lblContrasenia;
	private TextField tfNombre, tfContrasenia;
	private Button btnAcceder, btnCancelar;
	private Alert alPermitido, alDenegado;
	
	public Vista() {
		super();
		
		lblNombre = new Label("Nombre:");
		lblContrasenia = new Label("Contraseña:");
		
		tfNombre = new TextField();
		tfContrasenia = new TextField();
		
		btnAcceder = new Button("Acceder");
		btnAcceder.setDefaultButton(true);
		
		btnCancelar = new Button("Cancelar");
		
		alPermitido = new Alert(AlertType.INFORMATION);
		alDenegado = new Alert(AlertType.ERROR);
		
		this.setHgap(5);
		this.setVgap(5);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll();
	}

	public Label getLblNombre() {
		return lblNombre;
	}

	public Label getLblContrasenia() {
		return lblContrasenia;
	}

	public TextField getTfNombre() {
		return tfNombre;
	}

	public TextField getTfContrasenia() {
		return tfContrasenia;
	}

	public Button getBtnAcceder() {
		return btnAcceder;
	}

	public Button getBtnCancelar() {
		return btnCancelar;
	}

	public Alert getAlPermitido() {
		return alPermitido;
	}

	public Alert getAlDenegado() {
		return alDenegado;
	}
	
}
