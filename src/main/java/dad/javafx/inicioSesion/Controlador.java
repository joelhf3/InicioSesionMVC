package dad.javafx.inicioSesion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class Controlador {

	private Vista vista = new Vista();
	private Modelo modelo = new Modelo();
	private List<String> listNombre = new ArrayList<String>();
	private List<String> listContrasenia = new ArrayList<String>();
	
	public Controlador() throws IOException {
		
		modelo.nombreProperty().bind(vista.getTfNombre().textProperty());
		modelo.contraseniaProperty().bind(vista.getPsContrasenia().textProperty());
		
		vista.getBtnCancelar().setOnAction(e->cerrar(e));
		vista.getBtnAcceder().setOnAction(e->comprobar(e));
			
		FileReader fr = new FileReader("datos.csv");
		BufferedReader br = new BufferedReader(fr);
		
		String linea;
		while ((linea = br.readLine()) != null) 
		{
			String [] partes = linea.split(",");
			listNombre.add(partes[0]);
			listContrasenia.add(partes[1]);
		}
		
		br.close();
		fr.close();	
	}

	private void comprobar(ActionEvent e)  {
		
		String contrasenia = DigestUtils.md5Hex(modelo.getContrasenia()).toUpperCase();
		
		for(int i = 0; i < listNombre.size(); i++)
		{
			if(modelo.getNombre().equals(listNombre.get(i)))
			{
				if(contrasenia.equals(listContrasenia.get(i)))
				{
					vista.getAlPermitido().show();
					Stage escena = (Stage) vista.getBtnAcceder().getScene().getWindow();
					escena.close();
					return;
				}
			}
			else
			{
				vista.getAlDenegado().show();
				vista.getPsContrasenia().setText("");
				return;
			}
		}
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
