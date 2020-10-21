package dad.javafx.inicioSesion;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Vista extends GridPane {

	private Label lblNombre, lblContrasenia;
	private TextField tfNombre, tfContrasenia;
	private Button btnAcceder, btnCancelar;
	private Alert alPermitido, alDenegado;
	private HBox hbBotones;
	
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
		alPermitido.setTitle("Inicio de Sesión");
		alPermitido.setHeaderText("Acceso Permitido");
		alPermitido.setContentText("Las credenciales de acceso son válidas");
		
		alDenegado = new Alert(AlertType.ERROR);
		alDenegado.setTitle("Inicio de Sesión");
		alDenegado.setHeaderText("Acceso Denegado");
		alDenegado.setContentText("El usuario y/o la contraseña no son válidos");
		
		hbBotones = new HBox(btnAcceder, btnCancelar);
		hbBotones.setSpacing(5);
		
		this.setHgap(5);
		this.setVgap(5);
		this.setAlignment(Pos.CENTER);
		this.add(lblNombre, 0, 0);
		this.add(tfNombre, 1, 0);
		this.add(lblContrasenia, 0, 1);
		this.add(tfContrasenia, 1, 1);
		this.add(hbBotones, 1, 2);
		
		GridPane.setMargin(hbBotones, new Insets(5));
		
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

	public HBox getHbBotones() {
		return hbBotones;
	}
	
}
