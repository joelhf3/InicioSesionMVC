package dad.javafx.inicioSesion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Modelo {

	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty contrasenia = new SimpleStringProperty();
	
	public final StringProperty nombreProperty() {
		return this.nombre;
	}
	
	public final String getNombre() {
		return this.nombreProperty().get();
	}
	
	public final void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}
	
	public final StringProperty contraseniaProperty() {
		return this.contrasenia;
	}
	
	public final String getContrasenia() {
		return this.contraseniaProperty().get();
	}
	
	public final void setContrasenia(final String contrasenia) {
		this.contraseniaProperty().set(contrasenia);
	}
	
}
