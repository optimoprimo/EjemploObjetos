package persona;

import java.util.Objects;

public class Persona {

	private String sexo = "indefinido";
	private Integer piernas = 2;
	private Integer brazos = 2;

	public Persona() {
	}

	public Persona(String sexo, Integer piernas, Integer brazos) {
		this.sexo = sexo;
		this.piernas = piernas;
		this.brazos = brazos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getPiernas() {
		return piernas;
	}

	public void setPiernas(Integer piernas) {
		this.piernas = piernas;
	}

	public Integer getBrazos() {
		return brazos;
	}

	public void setBrazos(Integer brazos) {
		this.brazos = brazos;
	}

	public static String getClase() {
		return "Persona";
	}

	public String getNombre() {
		return "Persona";
	}

	@Override
	public  String toString() {
		return "[ sexo : "+sexo+" , piernas : "+piernas+" , brazos : "+ brazos + " ]";
	}

}
