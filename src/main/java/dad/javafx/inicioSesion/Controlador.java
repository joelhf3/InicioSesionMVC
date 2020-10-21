package dad.javafx.inicioSesion;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class Controlador {

	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	
	public Controlador() {
		
		vista.getBtnCancelar().setOnAction(e->cerrar(e));
		
	}

	private void cerrar(ActionEvent e) {
		
		Stage escena = (Stage) vista.getBtnCancelar().getScene().getWindow();
		escena.close();
	}

	public Vista getVista() {
		return vista;
	}

	public Modelo getModelo() {
		return modelo;
	}
	
}
